package Class8OOPs;

public class c1 {
    String name;
    int roll;

    void print(){
        System.out.println(roll);
        System.out.println(name);
    }
    public static void main(String[] args) {
        c1 s1 = new c1();
        s1.name="Agrim";
        s1.roll=2925;
        s1.print();
    }
}
