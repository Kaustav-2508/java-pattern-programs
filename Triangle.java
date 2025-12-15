
import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter three sides of a triangle  : ");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        if(s1==s2 && s1==s3 && s2==s3)
        {
            System.out.print("\n It is an equilateral triangle. ");
        }
        else if(s1==s2 || s1==s3 || s2==s3)
        {
            System.out.print("\n It is an isosceles triangle. ");
        }
        else
        {
            System.out.print("\n It ia a scalene triangle.");
        }
        sc.close();
    }
}    
