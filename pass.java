import java.util.Scanner;
class pass{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark<34)
        {
            System.out.println("you will pass");
        }
        else {
            System.out.println("fail in the exam");
        }
    }
}