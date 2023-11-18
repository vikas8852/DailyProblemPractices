/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean isAP(int a, int b, int c) {
        return (b - a) == (c - b);
    }
    
    public static boolean isAPFree(int[] sequence) {
        int n = sequence.length;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isAP(sequence[i], sequence[j], sequence[k]))
                        return false;
                }
            }
        }
        
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner sc=new Scanner(System.in);
		 int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the sequence
            int[] sequence = new int[n];
            
            for (int i = 0; i < n; i++) {
                sequence[i] = sc.nextInt();
            }
            
            if (isAPFree(sequence))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
		}
	    
}
	