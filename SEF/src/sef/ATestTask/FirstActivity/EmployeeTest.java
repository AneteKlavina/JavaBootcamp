package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        try {
            employee.setFirstName("Test1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(employee.getJobTitle());
        assertEquals("Message not OK", "Test1", employee.getFirstName());
        assertEquals("Message not OK", "Manager", employee.getJobTitle());
    }

    @Test
    public void checkEmployeeCreated(){
        Employee employee = new Employee(45, "Manager", "ABC", 50000);

        assertEquals("Message", "TestName", employee.getFirstName());
        assertEquals("Message", "Manager", employee.getSecondName());
    }

}

