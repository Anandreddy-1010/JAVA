class computer{
    public void playmusic(){
        System.out.println("Music playing...");
    }
    public String getMeApen(int cost){
        if(cost>=10){
          return "pen";
        }
        else{
          return "Nothing";
        }    
    }    
    
}
class method{
    public static void main(String[] args) {
      computer obj=new computer();
      obj.playmusic();
      String str=obj.getMeApen(10);
      System.out.println(str);
    }
}