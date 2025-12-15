import java.util.Scanner;//imports Scanner class
 class Digits//Class begins
{
    public static void main(String args[])//Function Begins
    {
        Scanner sc = new Scanner(System.in);
        //taking input
        System.out.print("\n Enter any positive integer : ");
        int num=sc.nextInt();
        int digit=0;
        //condition checking
        if(num>=1 && num<=9)
        {
            digit =1;
        }
        else if(num>=10 && num<=99)
        {
            digit =2;
        }
        else if(num>=100 && num<=999)
        {
            digit =3;
             
        }
        else if(num>=1000 &&num<=9999)
        {
            digit =4;
        }
        else
        {
            System.out.print("\n Please Enter a number between 1 and 10000 ");
        }
        //displaying output
        System.out.print("\n The no. of digits in the number is "+digit);
        sc.close();
    }//End of Function
}//End of class
