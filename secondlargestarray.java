public class secondlargestarray {
    public static void main(String[] args) {
        int[] arr={10,5,20,8,12};
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num<firstLargest){
                secondLargest=num;
            }
            if(secondLargest==Integer.MIN_VALUE){
                System.out.println("Second largest number does not exist");
            }
            else{
                System.out.println("Second largest elements:"+secondLargest);
            }
        }


    }
    
}
