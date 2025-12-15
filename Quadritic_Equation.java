import java.util.Scanner;//imports Scanner class
import java.lang.Math.*;//imports Math class
class Quadritic_Equation//Class Begins
{
    public static void main(String args[])//Function Begins
    {
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("\n Enter the values of the numeral co-efficients of a quadritic equation(ax^2+bx+c=0) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        //computing discriminant
        double d = Math.pow(b,2)-4*a*c;
        //initializing output storing variavbles
        String n_roots="";
        double roots=0.0;
        //condition checking
        if(d<0)
        {
            n_roots="Imaginary";
            //displaying output
            System.out.print("\n The nature of root is "+n_roots+"\n The value of root cannot be computed in this case");
        }
        else if(d>0)
        {
            n_roots="Real and Unequal";
            roots=(-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            double roots_sub = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            //displaying output
            System.out.print("\n The nature of root is "+n_roots+"\n The value of root is "+roots+" and "+roots_sub);
        }
        else
        {
            n_roots="Real and Equal";
            roots = -b/(2*a);
            //displaying output
            System.out.print("\n The nature of root is "+n_roots+"\n The value of root is "+roots);
        }
        sc.close();//closes the Scanner class
    }//End of function
}//End of class
