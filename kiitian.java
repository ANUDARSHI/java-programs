package pack2;
import pack1.*;
import java.util.Scanner;

public class kiitian extends student{
     String x;
    public void course()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nENTER THE COURSE NAME");
        x=sc.nextLine();
       
        System.out.println("\nENTER THE ROLL NO.");
        rollno=sc.nextInt();
        System.out.println("\nENTER THE REGISTRATION NO.");
        reg=sc.nextInt();
        System.out.println("\nDETAILS OF THE KIITIAN\n");
        System.out.println("Roll No. "+rollno+"\n");
        System.out.println("Registration number " + reg +"\n");
        System.out.println("Course Name "+x+"\n");
        sc.close();


    }
    public static void main(String[] args)
    {
        kiitian ob = new kiitian();
        ob.course();
    }
}
