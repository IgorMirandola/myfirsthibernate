package myfirsthibernate;

import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.hibernate.query.Query;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StudentDaoTest {

    @Test
    public void testGetStudents() {

        // Create a mock for the StudentDao
        StudentDao studentDaoMock = Mockito.mock(StudentDao.class);

        List<Student> fakeStudents = Arrays.asList(new Student("John", "Never", "fails"), new Student("Jane", "Never", "fails"));
        when(studentDaoMock.getStudents()).thenReturn(fakeStudents);

        // Call the method you want to test
        List<Student> result = studentDaoMock.getStudents();

        // Perform assertions or verifications as needed
        assertEquals(fakeStudents.size(), result.size());
        // Add more assertions as needed
    }
}
