import java.util.*;
public class uc2_calculation_of_two_lines {
    public static void main(String args[]) {
        System.out.println("welcome to java computation programe");
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
        
    }
}