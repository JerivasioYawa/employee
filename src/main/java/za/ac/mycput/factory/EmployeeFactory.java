package za.ac.mycput.factory;

import org.apache.commons.validator.routines.EmailValidator;
import za.ac.mycput.domain.Address;
import za.ac.mycput.domain.Employee;
import za.ac.mycput.util.Helper;

import java.util.UUID;

public class EmployeeFactory {
    public static Employee createEmployee(String employeeNum, String firstName, String lastName, String email, double salary, Address address) {
        employeeNum = Helper.generateID();
        if (Helper.isEmptyOrNull(employeeNum) ||
                Helper.isEmptyOrNull(lastName) ||
                Helper.isEmptyOrNull(email)

        ) {
            return null;
        }

        if (Helper.isValidEmail(email)){
            return null;
        }

        if (Helper.isValidSalary(salary)){
            return null;
        }

        return new Employee(employeeNum, firstName, lastName, email, salary, address);
    }
}
