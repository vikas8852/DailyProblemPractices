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
		    int  count=0;
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int age[]=new int[n];
		    for(int i=0;i<n;i++){
		       age[i]=sc.nextInt();
		       if(age[i]>=x)
		       count++;
		    }
		    System.out.println(count);
		    
		}
	}
}
