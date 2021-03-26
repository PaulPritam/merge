
package net.codejava;
import java.util.*;
public class uc3_comparing_the_lines {

	public static void main(String[] args) {
		
		
		   
		        System.out.println("welcome to java computation program");
		      double x1;
		      double x2;
		      double y1;
		      double y2;
		      double length;
		      double x11;
		      double x22;
		      double y11;
		      double y22;
		      double length1;
		      Scanner sc= new Scanner(System.in);
		      System.out.println("enter the value of x1");
		      x1= sc.nextInt();
		      System.out.println("enter the value of x2");
		      x2= sc.nextInt();
		      System.out.println("enter the value of y1");
		      y1=sc.nextInt();
		      System.out.println("enter the value of y2");
		      y2=sc.nextInt();
		      length= Math.sqrt ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		      System.out.println("the solution is " +length);      
		    
		        System.out.println("now for the second line /n");
		         System.out.println("enter the value of second line (x1)");
		         x11= sc.nextInt();
		         System.out.println("enter the value of second line (x2)");
		         x22= sc.nextInt();
		         System.out.println("enter the value of second line (y1)");
		         y11= sc.nextInt();
		         System.out.println("enter the value of second line (y2)");
		         y22= sc.nextInt();
		         length1= Math.sqrt ((x22-x11)*(x22-x11) + (y22-y11)*(y22-y11));
		         System.out.println("the solution is " +length1);
		        
		         if (length == length1)
		         {
		             System.out.println("both the lines are equal ");
		         }
		          else if (length > length1)
		         {
		             System.out.println(" the first line is greater ");
		         }
		         else if (length < length1)
		         {
		             System.out.println(" the second line is greater ");
		         }
		         else 
		         {
		             System.out.println("they are un-equal lines");
		         }
		    }
		}
	


