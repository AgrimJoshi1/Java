package Class15;

class parent{
    parent(){
        System.out.println("parent");
    }

}
class c1 extends parent{
    c1(){
        System.out.println("Child 1");
    }

}

public class inheritance {
    public static void main(String[] args) {
        parent ob = new c1();
        parent ob1;
        ob1 = new c1();

        
    }
    
}
