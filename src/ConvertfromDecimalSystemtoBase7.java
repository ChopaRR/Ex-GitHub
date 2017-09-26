import java.util.Scanner;

public class ConvertfromDecimalSystemtoBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int baseToConvet = 7;

        System.out.println(Integer.toString(num,baseToConvet));
    }
}
