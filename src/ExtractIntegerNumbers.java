import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
