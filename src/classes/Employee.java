package classes;

/**
 * Created by JPMC-B2-PC07 on 17/02/2017.
 */
public class Employee extends Person{

    private String department;
    private String payGrade;
    private int employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId() {
        this.employeeId = employeeId;
    }

    public String introduceYourself(String firstName, String lastName) {
        return "Hello, I'm " + firstName + " " + lastName + ". How may I help you?";
    }

    public String introduceYourself(String firstName, String lastName, int age, char gender) {
        return "Hello, I'm " + firstName + " " + lastName + age + " years old and a " + gender + ". How may I help you?";
    }
}
