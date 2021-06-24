import java.util.Arrays;
/**
 * Write a description of class Main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main2
{
    public static void main(String[] args)
    {
        // q1 1D Array problems
        
        // duplicate
        // Inputs: int[] A
        // Output: boolean
        // Return true if A has any duplicate elements and false otherwise
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(duplicate(A));
        int B[] = {1,2,3,4,5,5,7,8,9,10};
        System.out.println(duplicate(B));
        
        // union
        // Inputs: int[] A, int[] B
        // Output: int[]
        // Return all elements that exist in either A OR B.
        int C[] = {1,3,5,7};
        int D[] = {2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(union(C, D)));
        
        // intersection
        // Inputs: int[] A, int[] B
        // Output: int[]
        // Return all elements that exist in both A AND B.
        System.out.println(Arrays.toString(intersection(C, D)));
        
        // reverse (hard)
        // Inputs: int[] A
        // Output: int[]
        // Return the reverse of the input
        // Ex. [1,2,3,4,5] ⇒ [5,4,3,2,1]
        System.out.println(Arrays.toString(reverse(A)));
        
        // longestContinuousSubsequence (hard)
        // Inputs: int[] A
        // Output: int
        // Return the length of the longest continuous subsequence
        // [1,2,3,3,3,4,5] ⇒ 3
        int[] E = {1,2,3,3,3,4,5,5,5,5};
        System.out.println(longestContinuousSubsequence(E));
        
        // q2 2D Array problems
        
        // ithRow
        // Inputs: int[][] A, int i
        // Output: int[]
        // Returns the int[] at the ith index of A
        int F[][] = {{1,3,5,7,9}, {2,4,8,0}, {11,22,55,77,99}, {42,99,65,87,26,90}, {3,2,1,5,8}};
        System.out.println(Arrays.toString(ithRow(F, 3)));
        
        // sum
        // Inputs: int[][] A, int[][] B
        // Output: int[][]
        // Assume that A and B have the same dimensions. Returns the “sum” of A and B (search matrix addition). 
        // The output should have the same dimensions as A and B and the corresponding element should be the sum of the elements from A and B. 
        int G[][] = {{1,3,5,7,9}, {2,4,8,0}, {11,22,55,77,99}, {42,99,65,87,26,90}, {3,2,1,5,8}};
        System.out.println(Arrays.deepToString(sum(F, G)));
        
        // checkSum
        // Inputs: int[][] A, int c
        // Output: boolean
        // Returns true if all rows of A sum to c and false otherwise. 
        int H[][] = {{1,5}, {2,4}, {3,3}, {6,0}};
        System.out.println(checkSum(H, 6));
        
        // columnSum (hard)
        // Inputs: int[][] A, int c
        // Output: boolean
        // Returns true if all cols of A sum to c and false otherwise
        int I[][] = {{1,5}, {2,4}, {3,3,10}, {6,0,2}};
        System.out.println(columnSum(I, 12));
    }
    
    // duplicate
    // Inputs: int[] A
    // Output: boolean
    // Return true if A has any duplicate elements and false otherwise
    public static boolean duplicate(int[] A)
    {
        for (int i=0; i<A.length; i++) {
            for (int j=i+1; j<A.length; j++) {
                if (A[i] == A[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // union
    // Inputs: int[] A, int[] B
    // Output: int[]
    // Return all elements that exist in either A OR B.
    public static int[] union(int[] A, int[] B)
    {
        int[] C = new int[A.length+B.length];
        int i;
        for (i=0; i<A.length; i++) {
            C[i] = A[i];
        }
        for (int j=0; j<B.length; j++) {
            int k;
            for (k=0; k<A.length; k++) {
                if (B[j] == A[k]) {
                    break;
                }
            }
            if (k==A.length) {
                C[i] = B[j];
                i+=1;
            }
        }
        // resize the result array
        int[] D = new int[i];
        for (int m=0; m<i; m++) {
            D[m] = C[m];
        }
        return D;
    }
    
    // intersection
    // Inputs: int[] A, int[] B
    // Output: int[]
    // Return all elements that exist in both A AND B.
    public static int[] intersection(int[] A, int[] B)
    {
        int[] C = new int[A.length];
        int k=0;
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if (A[i] == B[j]) {
                    C[k] = A[i];
                    k+=1;
                    break;
                }
            }
        }
        // resize the result array
        int[] D = new int[k];
        for (int m=0; m<k; m++) {
            D[m] = C[m];
        }
        return D;
    }
    
    // reverse (hard)
    // Inputs: int[] A
    // Output: int[]
    // Return the reverse of the input
    // Ex. [1,2,3,4,5] ⇒ [5,4,3,2,1]
    public static int[] reverse(int[] A)
    {
        for (int i=0; i<A.length/2; i++) {
            // swap A[i] and A[A.length-1-i]
            int temp=A[i];
            A[i]=A[A.length-1-i];
            A[A.length-1-i]=temp;
        }
        return A;
    }
    
    // longestContinuousSubsequence (hard)
    // Inputs: int[] A
    // Output: int
    // Return the length of the longest continuous subsequence
    // [1,2,3,3,3,4,5] ⇒ 3
    public static int longestContinuousSubsequence(int[] A)
    {
        int max=1, count=1;
        for (int i=1; i<A.length; i++) {
            if (A[i] == A[i-1]) {
                count+=1;
                if (count>max) {
                    max=count;
                }
            }
            else {
                count=1;
            }
        }
        return max;
    }
    
    // q2 2D Array problems
    
    // ithRow
    // Inputs: int[][] A, int i
    // Output: int[]
    // Returns the int[] at the ith index of A
    public static int[] ithRow(int[][] A, int i)
    {
        return A[i];
    }
    
    // sum
    // Inputs: int[][] A, int[][] B
    // Output: int[][]
    // Assume that A and B have the same dimensions. Returns the “sum” of A and B (search matrix addition). 
    // The output should have the same dimensions as A and B and the corresponding element should be the sum of the elements from A and B. 
    public static int[][] sum(int[][] A, int[][] B)
    {
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[i].length; j++) {
                A[i][j] += B[i][j];
            }
        }
        return A;
    }
    
    // checkSum
    // Inputs: int[][] A, int c
    // Output: boolean
    // Returns true if all rows of A sum to c and false otherwise. 
    public static boolean checkSum(int[][] A, int c)
    {
        for (int i=0; i<A.length; i++) {
            int rowSum=0;
            for (int j=0; j<A[i].length; j++) {
                rowSum += A[i][j];
            }
            if (rowSum != c) {
                return false;
            }
        }
        return true;
    }
    
    // columnSum (hard)
    // Inputs: int[][] A, int c
    // Output: boolean
    // Returns true if all cols of A sum to c and false otherwise
    public static boolean columnSum(int [][] A, int c)
    {
        int maxCol=0;
        // find the max column count
        for (int i=0; i<A.length; i++) {
            if (A[i].length > maxCol) {
                maxCol = A[i].length;
            }
        }
        // for each column
        for (int i=0; i<maxCol; i++) {
            int colSum=0;
            // for each row
            for (int j=0; j<A.length; j++) {
                // only count it if this row has enough columns
                if (i < A[j].length) {
                    colSum += A[j][i];
                }
            }
            if (colSum != c) {
                return false;
            }
        }
        return true;
    }
}
