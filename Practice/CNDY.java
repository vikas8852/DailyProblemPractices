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
		    int arr []= new int[2*n];
		    for(int i=0;i<2*n;i++){
		        arr[i]=sc.nextInt();
		    }
		    boolean b=true;
		    
		    for(int i=0;i<2*n-1;i++){
		        int count =1;
		        for(int j=i+1;j<2*n;j++){
		            if(arr[i]==arr[j])
		            count++;
		        }
		        if(count==3){
		            b=false;
		            System.out.println("No");
		             break;
		        }
		        
		         
		    }
		    if(b)
		     System.out.println("Yes");
		    
		}
	}
}
