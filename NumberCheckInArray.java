import java.util.Scanner;

public class NumberCheckInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num + " exists in the array.");
        } else {
            System.out.println(num + " does not exist in the array.");
        }
    }
}
