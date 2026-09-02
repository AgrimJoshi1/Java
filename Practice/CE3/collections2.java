package Practice.CE3;
import java.util.*;

public class collections2 {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>(); //HashSet & TreeSet

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
    
        ArrayList<Integer> list = new ArrayList<>(); //ArrayList & LinkedList

        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);

        System.out.println(list);

        //Collections Store Objects Not Primitive 
        ArrayList<Integer> a1 = new ArrayList<>();
        LinkedList<String> l1 = new LinkedList<>();
        HashSet<Double> h1 = new HashSet<>();
        TreeSet<Integer> t1 = new TreeSet<>();
    
    }
}
