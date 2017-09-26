import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        Integer num1 = scanner.nextInt();
        Double num2 = scanner.nextDouble();
        Double num3 = scanner.nextDouble();

        String word3 = scanner.next();
        double sum = num2 + num3 + num1;

        System.out.println(word1 + " " + word2 + " " + word3 + " " + (int)sum);

    }
}
