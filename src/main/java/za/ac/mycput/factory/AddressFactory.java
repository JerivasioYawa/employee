package za.ac.mycput.factory;

import za.ac.mycput.domain.Address;
import za.ac.mycput.util.Helper;

public class AddressFactory {

    public static Address createAdress(String streetNumber, String streetName, String postalCode, String city, String province, String country) {
        if (Helper.isEmptyOrNull(streetNumber) ||
                Helper.isEmptyOrNull(streetName) ||
                Helper.isEmptyOrNull(postalCode) ||
                Helper.isEmptyOrNull(city) ||
                Helper.isEmptyOrNull(province) ||
                Helper.isEmptyOrNull(country)
        ) {
            return null;
        }

        return new Address();

    }
//Added Helper class to simplify the program
//            if (streetNumber == null || streetNumber.isEmpty())
//                return null;
//        if (streetName == null || streetName.isEmpty())
//            return null;
//        if (postalCode == null || postalCode.isEmpty())
//            return null;
//        if (city == null || city.isEmpty())
//            return null;
//        if (province == null || province.isEmpty())
//            return null;
//        if (country == null || country.isEmpty())
//            return null;


}
