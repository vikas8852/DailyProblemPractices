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
		   int a[]=new int[4];
		    for(int i=0;i<4;i++)
		    a[i]=sc.nextInt();
		    Arrays.sort(a);
		    if(a[0]==a[1] && a[2]==a[3])
		     System.out.println("YES");
		    else
		     System.out.println("NO");
		}
	}
}
