import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] vhod = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(vhod[col]);
            }
        }

        int primeD = 0;
        int secondD = 0;
        for (int i = 0; i < size; i++) {
            primeD+= matrix[i][i];
            secondD+=matrix[i][size-1-i];
        }

        System.out.println(Math.abs(primeD-secondD));

    }
}
