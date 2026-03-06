package za.ac.mycput.domain;

public class Manager extends Employee {
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String employeeNum, String firstName, String lastName, String email, double salary, Address address, double bonus) {
        super(employeeNum, firstName, lastName, email, salary, address);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", employeeNum='" + employeeNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
