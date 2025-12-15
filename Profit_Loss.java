
import java.util.Scanner;//Imports the SCanner class
public class Profit_Loss
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n Enter the Cost Price and the Selling Price : ");
        double CP=sc.nextDouble();
        double SP=sc.nextDouble();
        if(SP>CP)
        {
            double pr = SP-CP;
            System.out.print("\n The profit earned is : "+pr);
        }
        else if(CP>SP)
        {
            double ls=CP-SP;
            System.out.print("\n The loss suferred is "+ls);
        }
        else
        {
            System.out.print("\n There is neither profit nor loss " );
        }
        sc.close();
    }
}    
