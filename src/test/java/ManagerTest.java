import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void Before(){
        manager = new Manager("HR", "Max Power", "JB123456R", 60000.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canGetNi() {
        assertEquals("JB123456R", manager.getNi());
    }
    @Test
    public void canGetName() {
        assertEquals("Max Power", manager.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000.00, manager.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalaryBy1percent(){
        assertEquals(600.00, manager.increaseSalary(),0.01);
    }
}


