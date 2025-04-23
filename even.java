import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }
        System.out.println("Sum of all even numbers in the array: " + evenSum);
        scan.close();
    }
}