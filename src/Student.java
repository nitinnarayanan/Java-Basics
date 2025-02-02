/*Create a Student class with name, rollNo, and marks as attributes.
Write a method to calculate the grade based on the marks and display the grade.
Create multiple instances of the Student class and print their grades.*/
public class Student {
    private String name;
    private int rollNo;
    private double marks;

    public Student(String name, int rollNo, double marks ){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String grades(){
        if (marks > 90)
            return "A";
        else if (marks < 90 && marks > 80)
            return "B";
        else if (marks < 80 && marks > 70)
            return "C";
        if (marks < 70 && marks > 60)
            return "D";
        else
            return "Fail";
    }

    public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student Roll no. : "+rollNo);
        System.out.println("Student marks: "+marks);
        System.out.println("Student Grade: "+grades());
        System.out.println("********************************\n");
    }

    public static void main (String[] args){
        Student s1 = new Student("Nitin", 570, 91.3);
        Student s2 = new Student("Nair", 575, 77.9);
        Student s3 = new Student("Nani", 450, 34.8);

        s1.display();
        s2.display();
        s3.display();


    }

}
