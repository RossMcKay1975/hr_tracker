import TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;


    @Before
    public void Before(){
        dataBaseAdmin = new DataBaseAdmin("Jimmy Power", "JB123459R", 18000.00);
    }


    @Test
    public void canGetNi() {
        assertEquals("JB123459R", dataBaseAdmin.getNi());
    }
    @Test
    public void canGetName() {
        assertEquals("Jimmy Power", dataBaseAdmin.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(18000.00, dataBaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canIncreaseSalaryBy1percent(){
        assertEquals(180.00, dataBaseAdmin.increaseSalary(),0.01);
    }
}
