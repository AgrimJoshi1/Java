package Practice.EndSem;

public class string2 {
    //Traversing a string 
    public static void main(String[] args) {
        
        String s = "Hello";
    
        for(int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i));
    
        }
        System.out.println();

        //Reverse Traversal
        for(int i = s.length()-1; i>=0 ; i--){
            System.out.println(s.charAt(i));
        }
    }
}
