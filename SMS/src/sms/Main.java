/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author 100059M
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("studentManagementContext.xml");
        StudentRepository ssp = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(ssp);
        ssp.saveStudent((Student)c.getBean("student1"));
        ssp.saveStudent((Student)c.getBean("student2"));
        ssp.saveStudent((Student)c.getBean("student3"));
        ssp.saveStudent((Student)c.getBean("student4"));
        ssp.saveStudent((Student)c.getBean("student5"));
        sms.listAllStudents();

    }

}
