package Practice.CE3;
import java.util.*;

public class arrlist2 {
    //input
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0; i<n;i++){
        list.add(sc.nextInt());
    }
    sc.close();

}
}