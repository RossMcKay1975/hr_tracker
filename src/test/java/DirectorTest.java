import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;


    @Before
    public void Before(){
        director = new Director("Senior Management",
                "Mo Power",
                "JB223456R",
                120000.00,
                300000);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Senior Management", director.getDeptName());
    }

    @Test
    public void canGetNi() {
        assertEquals("JB223456R", director.getNi());
    }
    @Test
    public void canGetName() {
        assertEquals("Mo Power", director.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000.00, director.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalaryBy1percent(){
        assertEquals(1200.00, director.increaseSalary(),0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(300000, director.getBudget(),0.01);
    }
}
