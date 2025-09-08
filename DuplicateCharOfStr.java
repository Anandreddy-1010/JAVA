public class DuplicateCharOfStr {
    public static void main(String[] args) {
        String str = "Programming";
        str = str.toLowerCase();   
        boolean[] seen = new boolean[256];  
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {        
                seen[c] = true;    
                result.append(c);  
            }
        }

        
        System.out.println("String after removing duplicates: " + result);
    }
}

