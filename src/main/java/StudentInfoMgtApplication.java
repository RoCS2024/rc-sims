import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;

public class StudentInfoMgtApplication {
    private final StudentFacade studentFacade;

    public StudentInfoMgtApplication() {
        StudentDao studentDaoImpl = new StudentDaoImpl();
        this.studentFacade = new StudentFacadeImpl(studentDaoImpl);
    }

    public StudentFacade getStudentFacade() {
        return studentFacade;
    }
}
