
/**
 * Write a description of class Main9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main9
{
    public static void main(String[] args)
    {
        System.out.println(sumDigits(123450900));
        System.out.println(reverseString("abcd ef"));
        System.out.println(threeFibonacci(6));
        System.out.println(subString("abc", " dflasjflkabcoijoj"));
        System.out.println(numberToBinary(25));
    }
    
    // Inputs: int n
    // Output: int
    // Given an integer, return the sum of the digits (remember that we can parse through the integer by /10 and get the last digit using %10)
    public static int sumDigits(int n)
    {
        if (n < 10) {
            return n;
        } else {
            return n%10 + sumDigits(n/10);
        }
    }
    
    // Inputs: String s
    // Output: String
    // Given a String, return the String in reverse order. 
    // Hint! Look at the String substring function and how to use it!
    public static String reverseString(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r += s.charAt(s.length()-i-1); 
        }
        return r;
    }
    
    // Inputs: int n
    // Output: int 
    // Given an integer n, return the nth term of the threeFibonacci sequence (the sequence is created by summing the past 3 terms instead of the past 2 terms) (the sequence starts with 0, 0, 1)
    // Ex. 5 ⇒ 0, 0, 1, 1, 2, 4, ⇒ The sequence is 0 indexed, so the 5th term is 4
    public static int threeFibonacci(int n)
    {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return threeFibonacci(n-1) + threeFibonacci(n-2) + threeFibonacci(n-3);
        }
    }
    
    // Inputs: String a, String b
    // Output: boolean
    // Given two Strings a and b, return whether a is a substring of b.
    // Ex. “hello”, “hello world” ⇒ True
    // Ex. “alpha”, “beta” ⇒ False
    public static boolean subString(String a, String b)
    {
        if (a.length() > b.length()) {
            return false;
        } else if (a.length() == b.length()) {
            return a.equals(b);
        } else { // compare a to substring of b from index 1 onwards OR substring of b from beginning to 1 char before the end
            return (subString(a, b.substring(1)) || subString(a, b.substring(0, b.length()-1)));
        }
    }
    
    // Input: int n
    // Output: String 
    // Return the binary representation of n in String form
    // Ex. 15 ⇒ “1111”   
    public static String numberToBinary(int n)
    {
        if(n < 2) {
            return String.valueOf(n);
        } else {
            return numberToBinary(n/2) + (n%2);
        }
    }
    
    // For the following sequences, list out the recurrence relationship and the base case. 
    // 4,7,10,13,...
    // base: x(0) = 4
    // recurrence: x(n) = x(n-1) + 3
    
    // 15,-30,60,-120
    // base: x(0) = 15
    // recurrence: x(n) = x(n-1) * (-2)
    
    // 1,4,16,64...
    // base: x(0) = 1
    // recurrence: x(n) = x(n-1) * 4    
}
