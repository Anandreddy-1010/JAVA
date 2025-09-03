import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        
        String reversed="";
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("palindrome");
        }
        else{
            System.err.println("not palindrome");
        }

    }
    
}
