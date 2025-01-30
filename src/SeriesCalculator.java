/*
 Create a class SeriesCalculator with a method calculateSum(int n)
 to calculate the sum of the first n numbers in the series 1 + 3 + 5 + 7 + ....
Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d" is the common difference.*/

public class SeriesCalculator{
    public int calculateSum(int n){
        int a = 1, d = 2;
        return ((n * ((2*a) + ((n-1) * d))/2));

    }
    public static void main (String[] args){
        SeriesCalculator obj = new SeriesCalculator();
        System.out.println("The output is "+obj.calculateSum(11));
    }
}