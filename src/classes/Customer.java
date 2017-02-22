package classes;

/**
 * Created by JPMC-B2-PC07 on 17/02/2017.
 */
public class Customer extends Person{

    String address;
    int telephoneNumber;
    int customerId;

    public Customer() {
    }
    public Customer(String firstName, String lastName ) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return 0;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setTelephoneNumber() {
    }

    public void setCustomerId() {
    }

    public String introduceYourself(String firstName, String lastName, int age) {
        return "Hi! I'm" + firstName + " " + lastName + age + " I want kerots";
    }

    }
