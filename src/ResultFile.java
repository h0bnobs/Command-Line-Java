import java.util.Scanner;

public class ResultFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        Double word1 = scanner.nextDouble();
        Double word2 = scanner.nextDouble();
        Double num1 = Double.parseDouble(String.valueOf(word1));
        Double num2 = Double.parseDouble(String.valueOf(word2));
        if (operator.equals("+")) {
            double answer1 = num1 + num2;
            System.out.println(answer1);
        } else if (operator.equals("-")) {
            double answer3 = num1 - num2;
            System.out.println(answer3);
        } else if (operator.equals("x")) {
            double answer2 = num1 * num2;
            System.out.println(answer2);
        } else if (operator.equals("/")) {
            double answer4 = num1 / num2;
            System.out.println(answer4);
        }
    }
}