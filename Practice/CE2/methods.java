package Practice.CE2;

public class methods {
    //method - block of code that performs a task

    static void hello(){
        System.out.println("helloo");
    }

    static void greet(String name){
        System.out.println("Hello " + name);
    }

    static int add(int a, int b){
        return a + b;
    }

    static int square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        hello();
        greet("Agrim");
        int result = add(10,20);
        System.out.println(result);

        int area = square(5);
        System.out.println(area);
    }
    
    

 


}
