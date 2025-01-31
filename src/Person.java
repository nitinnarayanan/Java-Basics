/*Create a class Person with firstName and lastName as data members.
Override the toString() method to return the full name of the person.
Define constructors to take appropriate parameters.*/
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return firstName+" "+lastName;
    }
    public static void main (String[] args){
        Person obj = new Person("Nitin", "Narayanan");
        System.out.println(obj.toString());
    }

}
