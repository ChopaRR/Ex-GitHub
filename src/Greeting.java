import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (word1.isEmpty()){
            word1 = "*****";
        }
        if (word2.isEmpty()){
            word2 = "*****";
        }
        System.out.printf("Hello, %s %s!", word1, word2);

    }
}
