import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][]matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int startRow=0;
        int startCol=0;
        int maxSum=0;

        for (int row = 0; row < rows-2; row++) {
            int sum =0;
            for (int col = 0; col < cols -2; col++) {
                sum = matrix[row][col]+matrix[row][col+1]+matrix[row][col+2]+
               matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]+
               matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];

                if (sum > maxSum){
                    maxSum = sum;
                    startRow=row;
                    startCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        System.out.print(matrix[startRow][startCol] + " ");
        System.out.print(matrix[startRow][startCol+1] + " ");
        System.out.println(matrix[startRow][startCol+2] + " ");
        System.out.print(matrix[startRow+1][startCol] + " ");
        System.out.print(matrix[startRow+1][startCol+1] + " ");
        System.out.println(matrix[startRow+1][startCol+2] + " ");
        System.out.print(matrix[startRow+2][startCol] + " ");
        System.out.print(matrix[startRow+2][startCol+1] + " ");
        System.out.println(matrix[startRow+2][startCol+2] + " ");
    }
}
