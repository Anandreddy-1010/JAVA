import java.util.Scanner;

class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

       
        s1 = s1.toUpperCase(); 
        s2 = s2.toUpperCase();

        if (s1.equals(s2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        sc.close(); 
    }
}
