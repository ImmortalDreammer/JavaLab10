package by.bntu.fitr.povt.woradreamteam.controller;

import by.bntu.fitr.povt.woradreamteam.view.Printer;
import by.bntu.fitr.povt.woradreamteam.individualTasks.*;
import java.util.Random;

public class IndividualTasks {

    private static final int RANDOM_BOUND = 15;
    private static final int RANDOM_CONST1 = -100;
    private static final int RANDOM_CONST2 = 100;
    public static void main(String[] args) {
        Lab11N lab11N = new Lab11N();
        Random random = new Random();
        double [] array = new double[random.nextInt(RANDOM_BOUND)];

        ArrayInitializer.fillTheArray(array,RANDOM_CONST1,RANDOM_CONST2);

        for (double el:array
             ) {
            Printer.Print(String.format("%.3f",el));
        }

        Printer.Print("Max element in array is: " + String.format("%.3f",lab11N.calculateMaxEl(array)));
        Printer.Print("Sum of the elements before last positive is: "
                + String.format("%.3f",lab11N.calculateSumBeforeLastPositive(array)));
    }
}
