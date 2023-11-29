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
		    int total=sc.nextInt();
		    int expend=sc.nextInt();
		    if(expend*30<=total)
		     System.out.println("YES");
		    else
		     System.out.println("No");
		}

	}
}
