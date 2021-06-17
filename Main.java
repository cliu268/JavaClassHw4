import java.util.Arrays;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        // q1
        // int[] A = {1, 8, 3, 7, 2, 5, 616};
        // System.out.println(A[0]);
        // System.out.println(A[4]);
        // System.out.println(A[A.length - 1]);
        // System.out.println(A[7]);
        
        // q2 sum
        /*  Inputs: int[] A
            Output: int
            This function should find the sum of all elements within A */
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(A));
            
        // q3 average
        /*  Inputs: int[] A
            Output: double
            This function should find the average of all the elements within A */
        int B[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(average(B));
            
        // q4 indexOf
        /*  Inputs: int[] A, int x
            Output: int
            This function should return the index of x if x exists inside of A otherwise return -1 */
        System.out.println(indexOf(B, 3));
        
        // q5 equals
        /*  Inputs: int[] A, int[] B
            Output: boolean
            This function should return true if A = B (if all elements match up in all the correct locations) and false otherwise */
        System.out.println(equals(A, B));
        
        // q6 evenBeforOdd
        /*  Inputs: int[] A
            Output: int[]
            This function should return an array with the exact same elements as A except all the even elements are placed before the odd elements
            Ex. {1,2,3,4,5} ⇒ {2,4,1,3,5}
            Bonus points if you can do it without creating an extra array! */
        int C[] = {1,2,3,4,5,6,7,22,99};
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(evenBeforOdd(C)));
        
        // q7 secondLargest (Hard)
        /*  Inputs: int[] A
            Output: int
            Assume A has more than 2 elements. 
            Return the secondLargest (second maximum) element in A, it could be the same as the original max if there are two elements that equal the max. */
        int D[] = {1,2,99,3,88,4,5,66,77,88};
        System.out.println(secondLargest(D));
            
        // q8 sort (Hard)
        /*  Inputs: int[] A
            Output: int[]
            Sort A from least to greatest and return A */
        System.out.println(Arrays.toString(sort(D)));

    }
    
    public static int sum(int A[]) {
        int ans=0;
        for (int i=0; i<A.length; i++) {
            ans+=A[i];
        }
        return ans;
    }
    
    public static double average(int A[]) {
        double ans=0;
        for (int i=0; i<A.length; i++) {
            ans+=A[i];
        }
        return ans/A.length;
    }  
    
    public static int indexOf(int A[], int x) {
        for (int i=0; i<A.length; i++) {
            if (A[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean equals(int A[], int B[]) {
        if (A.length != B.length) {
            return false;
        }
        for (int i=0; i<A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] evenBeforOdd(int[] A) {
        int even=-1;
        int odd=-1;
        int temp;
        
        for (int i=0; i<A.length; i++) {
            if(A[i]%2==0) { // even number
                even = i;
                if(odd != -1) {
                    // bubble even up to odd
                    while (odd < even) {
                        temp = A[even-1];
                        A[even-1] = A[even];
                        A[even] = temp;
                        even-=1;
                    }
                    odd+=1;
                }
            }
            else if (odd == -1) {
                odd = i;
            }
        }
        return A;
    }
    
    public static int secondLargest(int[] A) {
        int max1=A[0], max2=A[0];
        for (int i=0; i<A.length; i++) {
            if (A[i]>=max1) {
                max2=max1;
                max1=A[i];
            }
            else if (A[i]>max2) {
                max2=A[i];
            }
        }
        return max2;
    }
    
    public static int[] sort(int[] A) {
        int min=0;
        while (min<A.length) {
            for (int i=min; i<A.length; i++) {
                if (A[i]<A[min]) {
                    int temp=A[i];
                    A[i]=A[min];
                    A[min]=temp;
                }
            }
            min+=1;
        }
        return A;
    }
}
