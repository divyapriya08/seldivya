package newpackageforjava;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		  Scanner d=new Scanner(System.in);
		  System.out.println("The number is"); 
		  int n=d.nextInt();
		 
		 int c=0,a,temp;  
		      
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  