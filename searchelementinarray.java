import java.util.Scanner;

public class searchelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Number " + x + " found at index: " + i);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Number " + x + " not found in the array.");
        }

        sc.close();
    }
}
