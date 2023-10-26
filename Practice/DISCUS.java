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
		   int thr[]=new int[3];
		   for(int i=0;i<3;i++){
		       thr[i]=sc.nextInt();
		   }
		   Arrays.sort(thr);
		   System.out.println(thr[thr.length-1]);
		 
		}
	}
}
