import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] n = scanner.nextLine().split(", ");
        int size = Integer.parseInt(n[0]);
        String patter = n[1];
        int[][] matrix = new int[size][size];

        if (patter.equals("A")) {
            int firstNum = 1;
            for (int cols = 0; cols < size; cols++) {
                for (int rows = 0; rows < size; rows++) {
                    matrix[rows][cols] = firstNum;
                    firstNum++;
                }
            }
        }
        else {
            int firstNum = 1;
            for (int cols = 0; cols < size; cols++) {
                if(cols % 2 !=0) {
                    for (int rows = size-1; rows >= 0; rows--) {
                        matrix[rows][cols] = firstNum;
                        firstNum++;
                    }
                }else {
                    for (int rows = 0; rows < size; rows++) {
                        matrix[rows][cols] = firstNum;
                        firstNum++;
                    }
                }
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }

    }
}
