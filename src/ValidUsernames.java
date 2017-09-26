import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[\\w-]{3,16}$";
        String line = scanner.nextLine();
        if (line.equals("END")){
            System.out.println("(no output)");
        }

        while (!"END".equals(line)){
            if(Pattern.matches(regex,line)) {
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            line = scanner.nextLine();
        }
    }
}
