package acceptance_tests;

import org.junit.Test;
import planner.app.Activity;
import planner.app.Employee;

import static junit.framework.TestCase.assertEquals;

// Ansvarlig: Andreas
public class WhiteBoxTestRegisterTime {

    Activity activity = new Activity();
    Employee employee = new Employee("ABC");


    @Test(expected = Exception.class)
    public void testInputDataSetA() {
        double time = -1.0;
        employee.assignActivity(activity);
        assertEquals(employee.getRegisteredTime(activity.getID()), 0.0);
        employee.registerTime(activity.getID(), time);
    }

    @Test
    public void testInputDataSetB() {
        double time = 1.0;
        employee.assignActivity(activity);
        assertEquals(employee.getRegisteredTime(activity.getID()), 0.0);
        employee.registerTime(activity.getID(), time);
        assertEquals(employee.getRegisteredTime(activity.getID()), time);
    }
}
