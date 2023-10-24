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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>y && y!=0)
		     System.out.println("No");
		     else if(y==0){
		            System.out.println("Yes");
		        }
		     else if(y>=x){
		      int test=0;
		        for(int i=1;i<=n;i++){
		          if(x*i==y)
		             test+=1;
		            }
		            
		          if(test!=1)
		          System.out.println("No");
		          else
		           System.out.println("Yes");
		            
		            
		        }
		       
		    }
		}
}
