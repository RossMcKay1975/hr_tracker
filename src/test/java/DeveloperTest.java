import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void Before(){
        developer = new Developer("Minnie Power", "JB123457R", 24000.00);
    }


    @Test
    public void canGetNi() {
        assertEquals("JB123457R", developer.getNi());
    }
    @Test
    public void canGetName() {
        assertEquals("Minnie Power", developer.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24000.00, developer.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalaryBy1percent(){
        assertEquals(240.00, developer.increaseSalary(),0.01);
    }
}
