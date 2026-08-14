package Practice.CE2;
import java.util.*;

public class stringreversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for(int i = 0; i<words.length;i++){
            String word = words[i];

            for(int j = word.length() -1;j>=0;j--){
                System.out.println(word.charAt(j));
            }
            if(i<words.length-1){
                System.out.print(" ");
            }


        }
    }
}
