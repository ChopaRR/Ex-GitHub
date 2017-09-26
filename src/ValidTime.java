import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) (AM|PM)$");
        String line = scanner.nextLine();
        if (line.equals("END")){
            System.out.println("(no output)");
        }

        while (!"END".equals(line)){
            Matcher matcher = pattern.matcher(line);
           if (matcher.find()) {
               int hours = Integer.parseInt(matcher.group(1));
               int min = Integer.parseInt(matcher.group(2));
               int sec = Integer.parseInt(matcher.group(3));

               if (hours >= 1 && hours <= 12 && min >= 0 && min <= 59 && sec >= 0 && sec <= 59) {
                   System.out.println("valid");
               }else {
                   System.out.println("invalid");
               }
           }else {
               System.out.println("invalid");
           }
            line = scanner.nextLine();
        }
    }
}
