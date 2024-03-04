import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Customers {
    private String customerName;
    private String email;
    private int phoneNumber;

    public Customers(String customerName, String email, int phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public Customers() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String Customers1() throws FileNotFoundException {
        File fileName = new File("Costumers.txt");
        Scanner sc = new Scanner(fileName);

        StringBuilder myStrings = new StringBuilder();
        while (sc.hasNext()) {
            myStrings.append(sc.nextLine());
        }

        sc.close();

        return String.format("%s\\n", myStrings);
    }

}
