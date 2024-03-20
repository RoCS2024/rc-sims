package com.student.information.management.app.facade.student;

import com.student.information.management.app.model.student.Student;

import java.util.List;
/**
 *Facades conceal the complexity of underlying subsystems, such as SQL database operations, from the rest of the application.
 *This abstraction protects developers from dealing with complicated implementation details,
 *allowing them to focus on higher-level issues rather than getting bogged down in low-level complexities.
 *Facades centralise the management of subsystem interactions, making the system easier to maintain and update over time.
 *Changes to the underlying subsystem, such as switching to a different database technology,
 *can be made within the facade without affecting the rest of the application.
 *This makes the system more maintainable and flexible.
 **/
public interface StudentFacade {
    List<Student> getAllStudents();
    Student getStudentById(String studentId);
    boolean addStudent(Student student);
    boolean updateStudent(Student student);
}
