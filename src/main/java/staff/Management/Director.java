package staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String deptName, String name, String ni, double salary, double budget) {
        super(deptName, name, ni, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }


}
