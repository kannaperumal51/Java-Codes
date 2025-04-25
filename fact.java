import java.util.Scanner;
class kanna
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
             
        }
         System.out.println("Factorial of " + num + " is " + fact);
    }
}