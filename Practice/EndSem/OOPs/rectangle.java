package Practice.EndSem.OOPs;
/* Create a class Rectangle with attributes length and width, 
each defaulting to 1. The class should include set and get methods 
for both attributes, and a method to calculate the area of the rectangle. */


public class rectangle {
    int length,width;

    public rectangle(int r, int w){
        this.length = r;
        this.width = w;
    }

    public rectangle(){
        this.length = 1;
        this.width = 1;
    }


    public void setLength(int x){
        this.length = x;
        
    }

    public void setWidth(int y){
        this.length = y;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void area(){
        System.out.println(length*width);
    }




    public static void main(String[] args) {
        rectangle l1 = new rectangle(5,6);
        l1.setLength(7);
        l1.area();
        
    }
    
}
