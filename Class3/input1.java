package Class3;
import java.util.*;
public class input1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        //Scanner --> class, object---> instance, new--->constructor
        int x = ob.nextInt(); //for int
        // String s = newString("var");
        String s1 = ob.next();
        ob.nextLine();
        String s2 = ob.nextLine();//it will take input of space after the last variable, make extra var to eat space
        

        // String s2 = newString("var");

        System.out.println("Number is - " + x);
        System.out.println("String1 is - " + s1);
        System.out.println("String2 is - " + s2);

        ob.close();

         
        
    }
}
