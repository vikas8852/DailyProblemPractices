/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int totalCandies = 0;
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		        totalCandies += arr[i];
		    }
		    if((totalCandies%2) == 1)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    
		}
	}
}
