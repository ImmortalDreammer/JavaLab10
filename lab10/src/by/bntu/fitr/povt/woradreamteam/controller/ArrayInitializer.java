package by.bntu.fitr.povt.woradreamteam.controller;
import java.util.Random;

public class ArrayInitializer {
    public static void fillTheArray(double [] array, int min, int max){
        Random random = new Random();
        for (int i = 0; i<array.length;i++) {
            array[i] = random.nextDouble() + random.nextInt(max - min + 1) + min;
        }
    }

    public static void fillTheMatrix(int[][]matrix, int min, int max){
        Random random = new Random();
        for (int i = 0; i<matrix.length;i++) {
            for(int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }
}
