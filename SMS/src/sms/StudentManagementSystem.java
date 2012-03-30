
package sms;

import java.util.List;


public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

    StudentManagementSystem() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   

    public void listAllStudents() {
        
        List<Student> list1 = (List<Student>) repo.findAllStudents();
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i+1 + ". " + list1.get(i).getRegNumber());
        }
    }

    public void registerStudent(Student student) {

        repo.saveStudent(student);
    }
}
