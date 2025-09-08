class nonrepeatedcharstr{
    public static void main(String[] args) {
        String str="swiss";
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        char result='\0';
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                result=str.charAt(i);
                break;
            }
        }
        if(result!='\0'){
            System.out.println("First non repeated charcter:"+result);
        }
        else{
            System.out.println("Non repeated charcter not found");
        }
    }
}