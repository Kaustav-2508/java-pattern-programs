
import java.util.Scanner;
public class Fuel_Consumed
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the amount of fuel consumed : ");
        int fuel_cons=sc.nextInt();
        double D_amt=0.0;
        double Rs_nba=0.0;
        if(fuel_cons<=20)
        {
            D_amt=fuel_cons*10;
        }
        else if(fuel_cons<=50)
        {
            D_amt=fuel_cons*20;
        }
        else if(fuel_cons<=100)
        {
            D_amt=-fuel_cons*30;
        }
        else if(fuel_cons<=200)
        {
            D_amt=fuel_cons*40;
        }
        else
        {
            D_amt=fuel_cons*50;
        }
        Rs_nba=D_amt*112.75;
        Rs_nba=Rs_nba+0.06*Rs_nba;
        System.out.print("\n The net bill amount is "+Rs_nba);
        sc.close();
    }
}
