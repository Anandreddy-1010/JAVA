class minarray {
    public static void main(String[] args) {
        int[] arr={10,32,45,50,56};
        
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }

        }
        System.out.println("Minimum element in the array:"+min);

        
    }
    
}
