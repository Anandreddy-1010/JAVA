class swaparray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=arr.length;
        int temp = arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("Array after swapping first and last elements:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }


    }
    
}
