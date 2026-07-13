package Class8OOPs;

public class c2 {
    String name;
    int roll;

    void print(int roll){

        System.out.println(name);
        this.roll=roll;
        System.out.println(roll);
    }
    public static void main(String[] args) {
        c2 s1 = new c2();
        s1.name="Agrim";
        s1.print(19);
        System.out.println(s1.roll);
    }
    c2(){
        System.out.println("abc");
    }
}
