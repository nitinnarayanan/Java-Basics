/*Write a program to accept three numbers and find the largest of the three using method overloading.*/
public class largest {
    //largestNum method with passing 3 int values
    public int largestNum(int a, int b, int c){
        int largest = a;
        if (b > largest)
            largest = b;
        else if ( c> largest)
            largest = c;

        return largest;
    }
    //largestNum method with passing 2 int values
    public int largestNum(int a, int b){
        int largest = a;
        if (b > largest)
            largest = b;

        return largest;
    }
    public static void main(String[] args){
        largest o = new largest();
        System.out.println("The largest number is "+o.largestNum(45, 72));
        System.out.println("The largest number is "+o.largestNum(91, 80,118));
    }
}
