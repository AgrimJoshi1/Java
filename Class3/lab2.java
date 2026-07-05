package Class3;

public class lab2 {
    int a;
    int b;
    int c;
    public void assign(){
        a=5;
        b=6;
    }
    public void add(){
        c=a+b;
    }
    public void display(){
        System.out.println("Value of a "+ a);
        System.out.println("Value of b "+ b);
        System.out.println("Value of c "+ c);
    }
    public static void main(String[] args) {
     lab2 obj=new lab2();
     lab2 obj1 = new lab2();
     obj.assign();
     obj.add();
     obj.display();  
     obj1.assign();
     obj1.add();
     obj1.display();  
    }
}
