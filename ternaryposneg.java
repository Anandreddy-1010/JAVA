public class ternaryposneg {
    public static void main(String[] args) {
        int num=5;
        String result=(num>0) ? "positive" :(num<0) ? "negative" : "zero";
        System.out.println("The number " + num + " is " + result);
    }
    
}
