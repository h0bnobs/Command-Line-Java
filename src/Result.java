public class Result {
    public static void main(String[] args) {
        String operator = args[0];
        String word1 = args[1];
        String word2 = args[2];
        int num1 = Integer.parseInt(word1);
        int num2 = Integer.parseInt(word2);
        if(operator.equals("+")) {
            int answer1 = num1 + num2;
            System.out.println(answer1);
        }
        else if(operator.equals("*")) {
            int answer2 = num1 * num2;
            System.out.println(answer2);
        }
        else if(operator.equals("-")) {
            int answer3 = num1 - num2;
            System.out.println(answer3);
        }
    }
}