import java.util.*;
import java.time.LocalDate;

public class dob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first person's DOB (yyyy-mm-dd): ");
        String dob1str = sc.next();
        System.out.print("Enter second person's DOB (yyyy-mm-dd): ");
        String dob2str = sc.next();

        LocalDate dob1 = LocalDate.parse(dob1str);
        LocalDate dob2 = LocalDate.parse(dob2str);

        if (dob1.isBefore(dob2)) {
            System.out.println("The first person is elder.");
        } else if (dob1.isAfter(dob2)) {
            System.out.println("The second person is elder.");
        } else {
            System.out.println("Both persons are of the same age.");
        }

        sc.close();
    }
}
