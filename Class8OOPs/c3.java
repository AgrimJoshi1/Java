package Class8OOPs;

public class c3 {
    String name;
    int roll;

    void print(int roll) {
        System.out.println(name);
        this.roll = roll;
        System.out.println(this.roll);
    }

    c3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        c3 s3 = new c3("Hello");
        s3.print(10);
    }
}