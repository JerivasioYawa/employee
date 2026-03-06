package za.ac.mycput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isEmptyOrNull(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    public static boolean isValidSalary(double salary){

        if (salary<0 || salary>50000){
            return false;
        }
        return true;
    }

    public  static  boolean isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(email)){
            return true;
        }
        return false;
    }
}
