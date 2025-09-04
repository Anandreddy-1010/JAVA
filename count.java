class count {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,90,80};
        int count =0;
        for(int num:arr){
            if(num>50){
                count++;
            }
        }
        System.out.println("Numbers greater than 50:" +count);
    }
    
}
