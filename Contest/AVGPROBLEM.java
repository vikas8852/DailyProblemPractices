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
		int testCase=sc.nextInt();
		while(testCase-->0){
		    float num1=sc.nextInt();
		    float num2=sc.nextInt();
		    float num3=sc.nextInt();
		    
		    if((num1+num2)/2>num3){
		    System.out.println("Yes");
		}
	     	else{
		     System.out.println("No");
		}
		}
	
	}
	
}
