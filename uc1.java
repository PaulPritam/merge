import java.util.*;
public class welcome {
    public static void main(String args[]) {
        System.out.println("welcome to java computation programe");
      double x1;
      double x2;
      double y1;
      double y2;
      double length;
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
    }
}