package Class17;
import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student(101, "Arun", 85.5));
        students.add(new Student(102, "Priya", 91.0));
        students.add(new Student(103, "Rahul", 78.5));

        System.out.println("Initial Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Adding another student
        students.add(new Student(104, "Meena", 88.0));

        System.out.println("\nAfter Adding a Student:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Getting student at index 1
        System.out.println("\nStudent at index 1:");
        System.out.println(students.get(1));

        // Updating Priya's marks
        students.set(1, new Student(102, "Priya", 95.0));

        System.out.println("\nAfter Updating Priya's Marks:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Removing student at index 2
        students.remove(2);

        System.out.println("\nAfter Removing Student at Index 2:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Total number of students
        System.out.println("\nTotal Students: " + students.size());
    }
}
