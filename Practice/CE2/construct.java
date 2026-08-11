package Practice.CE2;

class Student{
    String name;
    int age; 
    
//Constructor is a block of code that runs automatically when obj is created
    // Student(String n, int a){
    //     name = n;
    //     age = a;
    // }

    /* Types of Constructors - 
        1. Default - Constructor with no params
        Eg Student(){
        name = "joshi";
        age = 10;
        }

        --------x--------x--------x--------x--------x--------

        2. Parameterized - Constructor that takes parameters
        Eg Student(String name, int age){
        this.name = name;
        this.age = age;
        }

        --------x--------x--------x--------x--------x--------

        3. 

     */

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student s = new Student("Agrim",18);
        System.out.println(s);
    }
}

public class construct {
    
}
