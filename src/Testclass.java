/*Fredo and Array Update:
Initial sum of array \(= 1+2+3+4+5= 15\)
When we update all elements to 4, sum of array \(= 4+4+4+4+4 = 20\) which is greater than \(15\).
Note that if we had updated the array elements to 3, \(sum= 15\) which is not greater than \(15\).
So, 4 is the minimum value to which array elements need to be updated.*/

import java.util.*;

class Testclass {
    public static void main(String args[] ) throws Exception {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int n = s.nextInt();
        System.out.println("Enter elements");
        int[] a = new int[n];
        int sum = 0, max = 0;
        for(int j =0;j<n;j++){
            a[j] = s.nextInt();
            sum = sum + a[j];
            if(a[j]>max)
                max=a[j];
        }
        int ans = a[0];
        System.out.println("\nThe array is:");
        System.out.println(Arrays.toString(a));
        System.out.println("The sum of array is: "+sum);

        for(int k =0;k<n;k++) {
            if ((a[k] * n) > sum) {
                if (a[k] < max) {
                    ans = a[k];
                }
            }
        }
        System.out.println("Answer is:"+ans);
    }
}
