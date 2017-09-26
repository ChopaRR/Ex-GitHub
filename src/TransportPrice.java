import java.util.Locale;
import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {
         Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double kilometers = scanner.nextDouble();
        String timeOfday = scanner.next();

        double totalPrice =0;

        if (kilometers <20){
            if(timeOfday.equals("day")){
                totalPrice = 0.7 + (kilometers * 0.79);
            }
            else if (timeOfday.equals("night")){
                totalPrice = 0.7 + (kilometers * 0.9);
            }
        }else if (kilometers < 100){
            totalPrice = kilometers * 0.09;
        }else {
            totalPrice = kilometers * 0.06;
        }

        System.out.printf("%.2f",totalPrice);
    }
}
