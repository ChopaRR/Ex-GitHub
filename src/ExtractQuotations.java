import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractQuotations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(\"|\')(.*?)\\1");
        String line = scanner.nextLine();
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            System.out.println(matcher.group(2));
        }
    }
}
