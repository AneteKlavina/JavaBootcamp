package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("Message not OK", "Test1", employee.getFirstName());
        assertEquals("Message not OK", "Manager", employee.getJobTitle());
    }

}
public class EmployeeTest {

    public void checkEmployeeCreated(){
        Employee employee = new Employee();
        employee.setFirstName("TestName");
        employee.setJobTitle("Manager");
        assertEquals("Message", "TestName", employee.getFirstName());
        assertEquals("Message", "Manager", employee.getSecondName());
    }

}

