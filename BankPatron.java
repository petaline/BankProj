import java.util.Scanner;
public class BankPatron
{
    private String name;
    private String surname;
    private double sal;
    private double cash;
    private BankAccount acct1;
    private BankAccount acct2;
    
    public BankPatron() {
        name = "...";
        surname = "...";
        sal = 0;
        cash = 0;
    }
    public BankPatron(String firstName, String lastName, double salary, double cashOnHand) {
        name = firstName;
        surname = lastName;
        sal = salary;
        cash = cashOnHand;
    }
}
