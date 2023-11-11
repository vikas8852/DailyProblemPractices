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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    String s=sc.next();
		    int dist=0;
		    int sat=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='0')
		        dist++;
		        else
		         sat++;
		         
		    }
		    System.out.println((dist*a)+(sat*b));
		    
		}
	}
}
