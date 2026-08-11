package Practice.CE2;


class Student{
    String name;
    int age; 
    int marks;
    //data members/ fields/ instance vars


    //Method in Class
    void display(){
        System.out.println(name);
        System.out.println(age);
    }


    public static void main(String[] args) {
        Student s = new Student();

        //Create student object and store its reference in s 
        //Multiple students from same class

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Joshi";
        s1.age = 18;

        s2.name = "Rahul";
        s2.age = 19;

        s3.name = "Aman";
        s3.age = 18;


        s.name = "Agrim";
        s.age = 18;
        s.marks = 100;

        s.display();

        // System.out.println(s.name);
        // System.out.println(s.age);
        // System.out.println(s.marks);
    
    }
}


public class classes{

    
}
