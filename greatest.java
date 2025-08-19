import java.util.Scanner;   

class greatest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Greatest number is: " + a);
        } else if (b > a) {
            System.out.println("Greatest number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }    
}
