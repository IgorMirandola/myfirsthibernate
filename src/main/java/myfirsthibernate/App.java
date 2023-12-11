package myfirsthibernate;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        studentDao.saveStudent(student);

        List < Student > students = studentDao.getStudents();
        for(Student s : students)
        {
        	System.out.println(s.getFirstName());
        }
    }	
}