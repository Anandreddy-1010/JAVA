
import java.util.*;

public class swapnibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-255): ");
        int num = sc.nextInt();

        int lowNibble = num & 0x0F;   
        int highNibble = num & 0xF0;  

        
        int swapped = (lowNibble << 4) | (highNibble >> 4);

        System.out.println("Original number: " + num);
        System.out.println("Swapped number: " + swapped);
        System.out.printf("Original (Hex): 0x%02X, Swapped (Hex): 0x%02X%n", num, swapped);
    }
}
