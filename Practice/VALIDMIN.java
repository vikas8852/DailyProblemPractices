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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int x = Math.min(a,b);
		    int r = Math.min(x,c);
		    int count = 0;
		    if(a==r)
		    count++;
		    if(b==r)
		    count++;
		    if(c==r)
		    count++;
		    if(count>=2)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
