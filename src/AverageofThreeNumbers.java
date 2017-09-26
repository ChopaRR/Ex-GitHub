import java.util.Locale;
import java.util.Scanner;

public class AverageofThreeNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        Double first = sc.nextDouble();
        Double second = sc.nextDouble();
        Double third = sc.nextDouble();

        Double avg = (first + second + third) /3;

        System.out.printf("%.2f", avg);

    }
}
