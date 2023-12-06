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
		    float x=sc.nextInt();
		    float y=sc.nextInt();
		    float z=sc.nextInt();
		    float tot=x*y;
		    float per=(z/tot)*100;
		    if(per>50.0)
		      System.out.println("Yes");
		    else
		      System.out.println("No");
		}
	}
}
