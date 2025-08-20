import java.util.Scanner;
class even{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the value of x:");
         int x=sc.nextInt();
         
         if(x%2==0){
             System.out.println("even");
         }else{
             System.out.println("odd");
         }
     }
}