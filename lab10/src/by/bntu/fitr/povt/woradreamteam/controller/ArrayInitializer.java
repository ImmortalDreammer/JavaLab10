package by.bntu.fitr.povt.woradreamteam.controller;
import java.util.Random;

public class ArrayInitializer {
    public static void fillTheArray(double [] array, int min, int max){
        Random random = new Random();
        for (int i = 0; i<array.length;i++) {
            array[i] = random.nextDouble() + random.nextInt(max - min + 1) + min;
        }
    }
}
