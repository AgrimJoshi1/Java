package Class14;

class Main1 {
    int a;
    static int b = 7;

    static {
        System.out.println("G1");
    }
}

public class G1 {
    static int x = 6;

    static {
        System.out.println("G1 is good");
    }

    public static void main(String[] args) {
        Main1 ob1 = new Main1();
        ob1.a = 23;
        Main1.b = 24;

        Main1 ob2 = new Main1();
        ob2.a = 145;
        Main1.b = 29;

        System.out.println(ob1.a);
        System.out.println(Main1.b);
        System.out.println(ob2.a);
        System.out.println(Main1.b);
        System.out.println(Main1.b);
    }
}