import java.util.Scanner;
public class ternary{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int num1 =scan.nextInt();
        int num2 =scan.nextInt();
        int num3 =scan.nextInt();
        int greatest = (num1 > num2 && num1 > num3) ? num1 :
                       (num2 > num1 && num2 > num3) ? num2 : num3;
        System.out.println("The greatest number is: " + greatest);
    }
}
