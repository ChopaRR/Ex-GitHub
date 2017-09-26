import java.util.Scanner;

public class ConvertBase7ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int baseToConvet = 7;

        System.out.println(Integer.toString(Integer.parseInt(num, baseToConvet)));;
    }
}