
import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("\n Enter any year : ");
       int yr=sc.nextInt();
       if(yr%4==0 && yr%100!=0 || yr%400==0)
       {
           System.out.print("\n "+ yr+" is a Leap Year");
       }
       else
       {
           System.out.print("\n "+yr+" is not a Leap year");
       }
       sc.close();
    }
}    
