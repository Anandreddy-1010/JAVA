public class vowels {
    public static void main(String[] args) {
        String str="Hello 123 World";
        int vowels=0,consonants=0,digits=0,spaces=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
            else if(c>='a'&& c<='z'){
                consonants++;
            }
            else if(c>='0' && c>='9'){
                digits++;

            }
            else if(c==' '){
                spaces++;
            }
        }
        System.out.println("vowels:"+vowels);
        System.out.println("consonants:"+consonants);
        System.out.println("digits:"+digits);
        System.out.println("spaces:"+spaces);

    }
    
}
