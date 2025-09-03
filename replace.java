import java.util.Scanner;
class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String result=str.replace('a','o');
        System.out.println("Modidfied string:" + result);

    }
    
}
