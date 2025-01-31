/*Create a class Biggest that contains a single-dimensional array as a data member and
a method display() to find and display the largest element of the array.*/
public class Biggest {
    private int[] num;

    public Biggest(int[] nums){
        this.num = nums;
    }
    public void display(){
        int largest = num[0];
        //tried enchanced forloop
        for (int i :  num){
            if (i > largest ){
                largest = i;
            }
        }
        System.out.println("Largest number in the array is: "+largest);
    }
    public static void main (String[] args){
        int[] numbers = {77, 89, 56, 24, 63,114, 87, 567, 44, 56, 14, 9, 77};
        Biggest obj = new Biggest(numbers);
        obj.display();
    }
}
