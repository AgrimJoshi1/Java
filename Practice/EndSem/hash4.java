package Practice.EndSem;

import java.util.HashSet;

public class hash4 {
        public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,4};

        HashSet<Integer> h1 = new HashSet<>();
        
        for(int i:arr){
            // h1.add(i);
            if(h1.contains(i)){
                System.out.println(i);
            }
            else{
                h1.add(i);
            }
        }

    }
    
}
