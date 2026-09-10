package Practice.EndSem;
import java.util.*;

public class hash1 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,4};

        HashSet<Integer> h1 = new HashSet<>(); //No duplicate
        
        for(int i:arr){
            h1.add(i);
            
        }
        System.out.println(h1);

    }
    
}
