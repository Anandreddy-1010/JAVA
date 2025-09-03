import java.util.Scanner;
class charcter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        if(str.length()>0){
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            System.out.println("Enter first charcter: " + first);
            System.err.println("Enter last charcter: " + last);

        }
        else{
            System.out.println("String is empty!");
        }
    }
    
}

