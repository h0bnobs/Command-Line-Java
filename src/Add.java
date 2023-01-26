public class Add {
    public static void main(String[] args) {
        String word1 = args[0];
        String word2 = args[1];
        int num1 = Integer.parseInt(word1);
        int num2 = Integer.parseInt(word2);
        int answer = num1 + num2;
        System.out.println(answer);
    }
}
