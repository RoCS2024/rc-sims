package com.student.information.management;

import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;
/**
 * This class is com.student.information.management.StudentInfoMgtApplication. This class represents the student information for website.
 * */
public class StudentInfoMgtApplication {
    private StudentFacade studentFacade;
    /**
     * This creates a new com.student.information.management.StudentInfoMgtApplication
     * @return the studentFacade this helps for managing student data.
     */
    public StudentInfoMgtApplication() {
        StudentDao studentDaoImpl = new StudentDaoImpl();
        this.studentFacade = new StudentFacadeImpl(studentDaoImpl);
    }
    /**
     * This gets the Student Facade.
     * @return the student facade.
     */
    public StudentFacade getStudentFacade() {
        return studentFacade;
    }
}
