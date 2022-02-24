import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String[] array = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(array[0]);
        int cols = Integer.parseInt(array[1]);

        String[][] matrix = new String[rows][];


        for (int i = 0; i < rows; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            matrix[i] = tokens;
        }

        System.out.println();
        String line;
        while(!(line = sc.nextLine()).equals("END")){
            String[] inputs = line.split("\\s+");
            String word = inputs[0];

            if(word.equals("swap") && inputs.length == 5){
                int num = Integer.parseInt(inputs[1]);
                int num1 = Integer.parseInt(inputs[2]);
                int num2 = Integer.parseInt(inputs[3]);
                int num3 = Integer.parseInt(inputs[4]);
                if(inBounds(matrix, num, num1) && inBounds(matrix, num2 , num3)){
                    String temp = matrix[num][num1];
                    matrix[num][num1] = matrix[num2][num3];
                    matrix[num2][num3] = temp;

                    for (int r = 0; r < matrix.length; r++) {
                        for (int c = 0; c < matrix[r].length; c++) {
                            System.out.print(matrix[r][c] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }

            }else{
                System.out.println("Invalid input!");
            }


        }
    }

    private static boolean inBounds(String[][] matrix, int row, int col){
        return row >= 0 && row < matrix.length && col >= 0 && col <= matrix[row].length;
    }
}
