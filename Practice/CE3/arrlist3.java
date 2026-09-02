package Practice.CE3;
import java.util.*;

public class arrlist3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());

        }
        for(int x : list){
            System.out.println(x);
        }

        Collections.sort(list);

        
        //Traversal
        for(int x : list){
            System.out.println(x);
        }
        System.out.println();

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
    
}
