package Class3;

public class lab3 {
    public int a,b,c;
    public void assign(int d1,int d2){
        a=d1;
        b=d2;
    }
    public int add(){return a+b;}
    public int sub(){return a-b;}
    public int mul(){return a*b;}
    public int div(){return a/b;}
    public void display(){
        System.out.println("Value of a= "+ a);
        System.out.println("Value of b= "+ b);
        System.out.println("Value of c= "+ c);
    }
    public static void main(String[] args) {
        lab3 obj = new lab3();
        obj.assign(5,2);
        int res = obj.add();
        int res = obj.add();
        int res = obj.add();
        int res = obj.add();
        System.out.println("Addition =" + res);
    }
}
