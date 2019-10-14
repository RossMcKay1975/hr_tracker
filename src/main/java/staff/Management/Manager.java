package staff.Management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String name, String ni, double salary) {
        super(name, ni, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return this.deptName;
    }



}
