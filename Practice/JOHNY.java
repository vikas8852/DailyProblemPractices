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
		   int a[]=new int[n];
		   for(int i=0;i<n;i++){
		       a[i]=sc.nextInt();
		   }
		   int k=sc.nextInt();
		   int x=a[k-1];
		   Arrays.sort(a);
		   for(int i=0;i<n;i++){
		       if(a[i]==x)
		        System.out.println(i+1);
		   }
		   
		}
	}
}
