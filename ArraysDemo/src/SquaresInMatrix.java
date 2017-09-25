import java.util.Scanner;

public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        String[][]matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (input[col]);
            }
        }
        int counter=0;
        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols-1; col++) {
                if (matrix[row][col].equals(matrix[row][col+1])
                        && matrix[row][col].equals(matrix[row+1][col])
                        &&matrix[row][col].equals(matrix[row+1][col+1])){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
