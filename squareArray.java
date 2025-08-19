 class squareArray {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Number square");
        for(int i=0;i<numbers.length;i++){
            int square=numbers[i]*numbers[i];
            System.out.println(numbers[i]+" "+square);
        }
    }
    
}
