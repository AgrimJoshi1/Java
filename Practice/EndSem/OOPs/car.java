package Practice.EndSem.OOPs;
/*Create a class Car with attributes make, model, and year. 
The class should have a method displayDetails() that prints the details of the car. 
Include a constructor to initialize these attributes. 
Create an instance of the Car class and display its details. */

public class car {
    String make;
    int model, year;

    public car(String make, int model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);

    }



    public static void main(String[] args) {

        // int arr[] = new int[];
        car m = new car("xyz",100,200);
        m.displayDetails();
        
    }

}


