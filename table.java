import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a table number");
        int k=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*" +k+ "=" + (k*i));
        }
        
    }
}