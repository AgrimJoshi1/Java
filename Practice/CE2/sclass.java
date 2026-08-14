package Practice.CE2;

class StudentStatic {
    String name;
    static String uni = "Chitkara";
}

public class sclass {
    public static void main(String[] args) {

        StudentStatic s1 = new StudentStatic();
        StudentStatic s2 = new StudentStatic();

        s1.name = "agrim";
        s2.name = "agrim2";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(StudentStatic.uni);
    }
}