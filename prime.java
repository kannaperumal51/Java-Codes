import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
         int k=scan.nextInt();
         if(k<=1)
         {
             System.out.println("this number is not prime number");
         }
         boolean prime=true;
         for(int i=2;i<k;i++)
         {
             if(k%i==0)
             {
                 prime=false;
             }
         }
             if(prime)
             {
                 System.out.println("prime number");
             }
             else
             {
                 System.out.println("not prime number");
             }
         
         
    }
}