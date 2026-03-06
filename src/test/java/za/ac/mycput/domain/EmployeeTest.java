package za.ac.mycput.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

   // Address address = new Address("23", "Molokwane", "8800", "Cape Town", "Western Cape", "South Africa");
   // Address address2 = new Address("43", "OR Tambo", "8808", "Cape Town", "Western Cape", "South Africa");

   // Employee e1 = new Employee("1001", "Ayabonga", "Yawa", "ayabonga@fake.com", 5000, address);
    //   Employee e2 = new Employee("1002", "Jervasio", "fall", "Jerivasio@fake.com", 10000);
   // Manager m1 = new Manager("1002", "Jervasio", "fall", "Jerivasio@fake.com", 10000, address2, 500);

    private Employee emp1;
    private Employee emp2;
    private Employee emp3;

    //Test identity
    @Test
    void testIdentity() {

        assertSame(emp1, emp1);
    }

    //Test Equality
    @Test
    void testEquality() {

        assertEquals(emp1, emp2);
    }


    @BeforeEach
    void setUp() {

        emp1 = new Employee();
        emp2 = new Employee();
        emp2 = emp1;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Disabled // to disable a test
    public void TestCreateAddress() {
       // Assertions.assertEquals(address.getCountry(), e1.getAddress().getCountry());

    }

    @Test
    @Order(1)
        // to order the execution of the test
    void setEmployeeNum() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void setSalary() {
    }

    @Test
    void getEmployeeNum() {
    }

    @Test
    void getFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void getSalary() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void testToString() {
    }
}