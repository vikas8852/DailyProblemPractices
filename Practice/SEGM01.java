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
		   String s=sc.next();
		    if(s.contains("1"))
		    {
		    int f=s.indexOf('1');
		    int l=s.lastIndexOf('1');
		    String str=s.substring(f,l+1);
		    if(!str.contains("0"))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    }
		    else
		    {
		    System.out.println("NO");
		    }
		}
	}
}
