package Class7;
import java.util.*;

public class c1 {
    
    public int a[], sum;
    public float avg;

    public void inputData1() {
        System.out.println("Enter inputs");
        a = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }
    }

    public void findsumavg() {
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }

        avg = sum / 5.0f;
    }

    public void displayresults() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + a[i]);
        }

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }

    public static void main(String[] args) {
        c1 obj = new c1();

        obj.inputData1();
        obj.findsumavg();
        obj.displayresults();
    }
}
    
