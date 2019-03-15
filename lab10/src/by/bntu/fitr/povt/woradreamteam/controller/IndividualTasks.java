package by.bntu.fitr.povt.woradreamteam.controller;

import by.bntu.fitr.povt.woradreamteam.util.UserInput;
import by.bntu.fitr.povt.woradreamteam.view.Printer;
import by.bntu.fitr.povt.woradreamteam.individualTasks.*;
import java.util.Random;

public class IndividualTasks {

    private static final int RANDOM_BOUND = 15;
    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_CONST1 = -5;
    private static final int RANDOM_CONST2 = 5;

    public static void main(String[] args) {
        Lab11Nastya lab11Nastya = new Lab11Nastya();
        Lab12Nastya lab12Nastya = new Lab12Nastya();
        Random random = new Random();
        double [] array = new double[random.nextInt(RANDOM_BOUND - RANDOM_MIN + 1) + RANDOM_MIN];
        int [][] matrix = /*{{1,1,3,2,2},{3,3,3,3,3}};*/new int[random.nextInt(RANDOM_BOUND)][random.nextInt(RANDOM_BOUND)];

        ArrayInitializer.fillTheArray(array,RANDOM_CONST1,RANDOM_CONST2);
        ArrayInitializer.fillTheMatrix(matrix,RANDOM_CONST1,RANDOM_CONST2);

        Printer.printLine("*****Task for lab 11 Anastasia*****");
        for (double el:array
             ) {
            Printer.print(String.format("%.3f",el) + " ");
        }

        Printer.printLine("\nMax element in array is: " + String.format("%.3f",lab11Nastya.calculateMaxEl(array)));
        Printer.printLine("Sum of the elements before last positive is: "
                + String.format("%.3f",lab11Nastya.calculateSumBeforeLastPositive(array)));


        Printer.printLine("\n*****Task for lab 12 Anastasia*****");
        for (int[] arr: matrix) {
            Printer.printLine("");
            for(int el: arr){
                Printer.print(el + " ");
            }
        }
        Printer.printLine("\nRow with the longest series of equal elements: " + lab12Nastya.findNumberOfRow(matrix));

        Printer.printLine("\n*****Task for lab 12 Kate*****");
        Lab12Kate exercise = new Lab12Kate();

        int[][] matrix1 = new int[3][3];

        exercise.Init(matrix1);
        int compareNum = UserInput.inputInt("Enter a compare number: ");
        int result = exercise.FindElement(matrix, compareNum);
        Printer.printLine("Result: " + result);
    }
}
