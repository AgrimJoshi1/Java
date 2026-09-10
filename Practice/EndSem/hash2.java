package Practice.EndSem;

import java.util.HashSet;

public class hash2 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,4};
        int target = 3;

        HashSet<Integer> h1 = new HashSet<>(); //No duplicate
        
        for(int i:arr){
            h1.add(i);

        }
        if(h1.contains(target))
            System.out.println("found");
    }
    
}
