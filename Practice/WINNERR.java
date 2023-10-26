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
		    int pa=sc.nextInt();
		    int pb=sc.nextInt();
		    int qa=sc.nextInt();
		    int qb=sc.nextInt();
		    int mp=Math.max(pa,pb);
		    int mq=Math.max(qa,qb);
		    if(mp>mq){
		        System.out.println("Q");
		    }
		    else if(mp<mq){
		        System.out.println("P");
		    }
		    else
		    System.out.println("TIE");
		}
	}
}
