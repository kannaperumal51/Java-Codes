import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int[] mark=new int[5];
        for(int i=0;i<=6;i++)
        {
            mark[i]=scan.nextInt();

        }
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        System.out.println(mark[0]+mark[1]+mark[2]+mark[3]+mark[4]);

    }
}