package classes;

import classes.Customer;
import classes.Employee;
import classes.Person;

public class Main {

    public static void main(String[] args) {

        int[] fEvenNumbers = new int[5];





        int[] myFactor = {7,6,5,4,3,2,1};
        int factor = 1;
        int f;
        for (f = 0; f < myFactor.length; f++) {
            factor *= myFactor[f];
        }
        System.out.print("Factorial of "+ myFactor[0] + " is = "+factor + "\n");


        System.out.print("*** AVERAGE Exercise ***\n");

        int[] mySum = {1,2,3,4,5,6};
        int sum = 0;
        int a;
        for (a = 0; a < mySum.length; a++) {
            sum += mySum[a];
        }
        System.out.print(sum + "\n");


        System.out.print("*** WHILE LOOP ***\n");

        int myArr = 1;
        while (myArr <= 10){
            System.out.print("[" + myArr + "]");
            myArr++;
        }

        System.out.print("\n*** FOR LOOP ***\r\n");

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print("["+i+"]");
        }

        System.out.print("\n*** DO WHILE LOOP ***\n");

        int x = 0;
        x++;
        do {
            System.out.print("[" + x +"]" );
            x++;
        } while(x <= 10);

    }
}



        /*Employee firstEmployee = new Employee();

        firstEmployee.setUsername("virgil17");
        firstEmployee.setEmail("virgilw@gmail.com");
        firstEmployee.setFirstName("Virgilio");
        firstEmployee.setLastName("Domingo");
        firstEmployee.setPassword("*******");
        firstEmployee.setPasswordAgain("*******");
        firstEmployee.setDepartment("Domingo1");
        firstEmployee.setPayGrade("Domingo2");
        firstEmployee.setEmployeeId();


        System.out.println("******* FIRST EMPLOYEE *******");
        System.out.println("USERNAME: " + firstEmployee.getUsername());
        System.out.println("EMAIL: " + firstEmployee.getEmail());
        System.out.println("FIRST NAME: " + firstEmployee.getFirstName());
        System.out.println("LAST NAME: " + firstEmployee.getLastName());
        System.out.println("PASSWORD: " + firstEmployee.getPassword());
        System.out.println("PASSWORD AGAIN: " + firstEmployee.getPasswordAgain());
        System.out.println("DEPARTMENT: " + firstEmployee.getDepartment());
        System.out.println("PAY GRADE: " + firstEmployee.getPayGrade());
        System.out.println("EMPLOYEE ID: " + firstEmployee.getEmployeeId());

        System.out.println(firstEmployee.introduceYourself("Mr. Bernard","an Employee"));
        System.out.println(firstEmployee.introduceYourself("Mr. Bernard","an Employee ", 22, 'M'));

        Customer firstCustomer = new Customer();
        Customer customerOne = new Customer("Neil","Agbay");


        System.out.println(customerOne.getFirstName() + " " + customerOne.getLastName());

        firstCustomer.setUsername("virgil17");
        firstCustomer.setEmail("nunezber31@gmail.com");
        firstCustomer.setFirstName("Virgilio");
        firstCustomer.setLastName("Domingo");
        firstCustomer.setPassword("*******");
        firstCustomer.setPasswordAgain("*******");
        firstCustomer.setAddress("");
        firstCustomer.setTelephoneNumber();
        firstCustomer.setCustomerId();

        System.out.println("******* FIRST CUSTOMER *******");
        System.out.println("USERNAME: " + firstCustomer.getUsername());
        System.out.println("EMAIL: " + firstCustomer.getEmail());
        System.out.println("FIRST NAME: " + firstCustomer.getFirstName());
        System.out.println("LAST NAME: " + firstCustomer.getLastName());
        System.out.println("PASSWORD: " + firstCustomer.getPassword());
        System.out.println("PASSWORD AGAIN: " + firstCustomer.getPasswordAgain());
        System.out.println("ADDRESS: " + firstCustomer.getAddress());
        System.out.println("TELEPHONE #: " + firstCustomer.getTelephoneNumber());
        System.out.println("CUSTOMER ID: " + firstCustomer.getCustomerId());

        System.out.println(firstCustomer.introduceYourself("\tJunemar","Fajardo",20));


       *//*         address;
        String telephoneNumber;
        String customerId*//*


        Person firstPerson = new Person();*/

        /*firstPerson.setUsername("nardo");
        firstPerson.setEmail("nunezber31@gmail.com");
        firstPerson.setFirstName("Bernard");
        firstPerson.setLastName("Nunez");
        firstPerson.setPassword("*******");
        firstPerson.setPasswordAgain("*******");

        String username = firstPerson.getUsername();
        String email = firstPerson.getEmail();
        String firstName = firstPerson.getFirstName();
        String lastName = firstPerson.getLastName();
        String password = firstPerson.getPassword();
        String passwordAgain = firstPerson.getPasswordAgain();

        System.out.println("******** FIRST USER *******");
        System.out.println("USERNAME: " + username);
        System.out.println("EMAIL: " + email);
        System.out.println("FIRST NAME: " + firstName);
        System.out.println("LAST NAME: " + lastName);
        System.out.println("PASSWORD: " + password);
        System.out.println("PASSWORD: " + passwordAgain);


        Person secondPerson = new Person();

        secondPerson.setUsername("rovz93");
        secondPerson.setEmail("asdads@gmail.com");
        secondPerson.setFirstName("Rovelyn");
        secondPerson.setLastName("Gwapa");
        secondPerson.setPassword("*******");
        secondPerson.setPasswordAgain("*******");

        String usernameTwo = secondPerson.getUsername();
        String emailTwo = secondPerson.getEmail();
        String firstNameTwo = secondPerson.getFirstName();
        String lastNameTwo = secondPerson.getLastName();
        String passwordTwo = secondPerson.getPassword();
        String passwordAgainTwo = secondPerson.getPasswordAgain();

        System.out.println("******** SECOND USER *******");
        System.out.println("USERNAME: " + usernameTwo);
        System.out.println("EMAIL: " + emailTwo);
        System.out.println("FIRST NAME: " + firstNameTwo);
        System.out.println("LAST NAME: " + lastNameTwo);
        System.out.println("PASSWORD: " + passwordTwo);
        System.out.println("PASSWORD: " + passwordAgainTwo);

        Person thirdPerson = new Person();

        thirdPerson.setUsername("jusafha");
        thirdPerson.setEmail("JHGAHSGJHGFJ@gmail.com");
        thirdPerson.setFirstName("Boooooo");
        thirdPerson.setLastName("Aaaaaang");
        thirdPerson.setPassword("*******");
        thirdPerson.setPasswordAgain("*******");

        String usernameThree = thirdPerson.getUsername();
        String emailThree = thirdPerson.getEmail();
        String firstNameThree = thirdPerson.getFirstName();
        String lastNameThree = thirdPerson.getLastName();
        String passwordThree = thirdPerson.getPassword();
        String passwordAgainThree = thirdPerson.getPasswordAgain();

        System.out.println("******** THIRD USER *******");
        System.out.println("USERNAME: " + usernameThree);
        System.out.println("EMAIL: " + emailThree);
        System.out.println("FIRST NAME: " + firstNameThree);
        System.out.println("LAST NAME: " + lastNameThree);
        System.out.println("PASSWORD: " + passwordThree);
        System.out.println("PASSWORD: " + passwordAgainThree);*/



    /*
	    byte byteVariable = 127; //range from -128 to 127;
        short mediumRangeDecimalVariable = 32767; //range from -32768 to 32767
        int decimalVariableUpTo = 2147483647; //in java <8 from -2147483648 to 2147483647 Java8+ 4294967296
        long largeDecimalVariableFrom = -9223372036854775808L;
        long largeDecimalVariableUpTo = 9223372036854775807L;


        System.out.println("Hello World");

    }
}
        */
