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
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    if(n%m==0 && (n/m)%2==0)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
