package Practice.EndSem.OOPs;
/*Write a Java program to demonstrate the use of constructors, copy constructors, encapsulation, and methods in a class.

Create an Employee class with the following private data members:

id – Employee ID
name – Employee name
salary – Employee salary

Implement:

A parameterized constructor to initialize the employee's ID, name, and salary.
A copy constructor to create a new Employee object by copying the details of an existing employee.
An increaseSalary(double percent) method that increases the employee's salary by the given percentage.
A display() method to print the employee's details.

In the main() method:

Create an employee e1 with ID 1, name "Ayush", and salary 200000.
Create another employee e2 using the copy constructor of e1.
Increase the salary of e2 by 20%.
Display the details of both e1 and e2.
Observe that modifying e2 does not affect the salary of e1. */


public class emp {
    int id; 
    String name;
    int salary;

    public emp(int x, String y, int z){
        this.id = x;
        this.name = y;
        this.salary = z;
    }

    public emp(emp a){
        this.id = a.id;
        this.name = a.name;
        this.salary = a.salary;
    }

    public void increaseSalary(double percent){
        double temp = (double)salary*percent/100;
        salary+= temp;

    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }




    public static void main(String[] args) {
        emp b = new emp(1,"agim",10000);
        emp c = new emp(b);
        c.increaseSalary(20);
        b.display();
        c.display();
        
    }

    
}
