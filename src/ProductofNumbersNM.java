import java.math.BigInteger;
import java.util.Scanner;

public class ProductofNumbersNM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int counter = n;
        BigInteger product = new BigInteger("1");

        do {
            product = product.multiply(new BigInteger(String.valueOf(counter)));
            counter++;
        }while (counter <= m);

        System.out.printf("product[%d..%d] = %d\n",n,m,product);

    }
}
