package Practice.EndSem;

public class stringq3 {
    //Reversal
    public static void main(String[] args) {
        
        String s = "Hello";
        String rev = "";
    
        for(int i = s.length()-1; i>=0;i--){
            rev += s.charAt(i);

        }

        //Palindrome

        if(s.equals(rev)){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Palindrome");
        }
        System.out.println(rev);
    }
}
