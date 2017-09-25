import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);


        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                StringBuilder sb = new StringBuilder();

                int ch1 = 97 + row;
                int ch2 = 97 + row + col;
                char one = (char) ch1;
                char two = (char) ch2;
                sb.append(one);
                sb.append(two);
                sb.append(one);
                matrix[row][col] = sb.toString();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }

    }
}
