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
		    int k=sc.nextInt();
		    int a[]=new int[n+k];
		    int sum=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        sum+=a[i];
		    }
		    for (int i=n;i<n+k ;i++) {
		        a[i] = sum+1;
		        sum += a[i];
		    }
		    if(a[n+k-1]%2==0)
		    System.out.println("even");
		    else
		     System.out.println("odd");
		}
	}
}
