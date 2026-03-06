package za.ac.mycput.domain;

public class Employee {
    protected String employeeNum;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected double salary;

    //Aggregation or Composition
    protected Address address;

    //Constructors
    public Employee() {
    }

    public Employee(String employeeNum, String firstName, String lastName, String email, double salary, Address address) {
        this.employeeNum = employeeNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.address = address;
    }




    //Getters
    public String getEmployeeNum() {
        return employeeNum;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum='" + employeeNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public static class Builder{

        protected String employeeNum;
        protected String firstName;
        protected String lastName;
        protected String email;
        protected double salary;

        //Aggregation or Composition
        protected Address address;

        //Setters
        public Builder setEmployeeNum(String employeeNum) {
            this.employeeNum = employeeNum;
            return this;
        }


        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public  Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public  Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

    }




}
