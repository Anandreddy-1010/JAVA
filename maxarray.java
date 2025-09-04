class maxarray {
    public static void main(String[] args) {
        int[] arr={10,32,45,50,56};
        
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }

        }
        System.out.println("Maximum element in the array:"+max);

        
    }
    
}
