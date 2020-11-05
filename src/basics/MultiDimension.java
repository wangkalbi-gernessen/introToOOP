package basics;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        // Create a two-dimension array
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // the sum of first row?
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        int rowSum = 0;
        for(int i = 0; i < data[0].length; i++){
            rowSum += data[0][i];
        }

        int[][] array = new int[3][4];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = i * j;
            }
        }
        System.out.print(Arrays.deepToString(array));
    }
}
