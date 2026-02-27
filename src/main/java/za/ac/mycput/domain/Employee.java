package za.ac.mycput.domain;

public class Employee {
    private String EmployeeNum;
    private String FirstName;
    private String lastName;

    public Employee() {
    }

    public Employee(String employeeNum, String firstName, String lastName) {
        this.EmployeeNum = employeeNum;
        this.FirstName = firstName;
        this.lastName = lastName;
    }

    public void setEmployeeNum(String employeeNum) {
        this.EmployeeNum = employeeNum;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNum() {
        return EmployeeNum;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum='" + EmployeeNum + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("1", "Ayabonga", "Yawa");
        Employee e2 = new Employee("2", "Jervasio", "fall");



        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
