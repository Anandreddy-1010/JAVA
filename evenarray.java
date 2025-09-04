class evenarray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10};
        System.out.println("Even numbers in the array:");
        for(int num:arr){
            if(num%2==0){
                System.out.println(num +" ");
            }
        }
    }
    
}
