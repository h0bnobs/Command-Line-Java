import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers here: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 * num2;
        System.out.println(sum);
    }
}