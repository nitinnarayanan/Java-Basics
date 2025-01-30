/*Create a class Calculator with the following methods:
calculateSum(int number1, int number2) to calculate the sum of two numbers.
calculateDifference(int number1, int number2) to calculate the difference between two numbers.*/
public class Calculator {
    public int calculateSum(int number1, int number2){
        return number1+number2;
    }
    public int calculateDifference(int number1, int number2){
        return number1-number2;
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();
        System.out.println("Output of sum function: "+obj.calculateSum(37, 87));
        System.out.println("Output of difference function: "+obj.calculateDifference(119, 90));


    }
}
