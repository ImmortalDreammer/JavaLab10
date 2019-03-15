package by.bntu.fitr.povt.woradreamteam.individualTasks;

import java.util.Random;

public class Lab12Kate {
    public void Init(int[][] matrix) {

        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+ " ");
            }
        }
    }

    public int FindElement(int[][] matrix, int compareNum){
        boolean isSatisfies; // Флаг для проверки столбцов
        int minM = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < matrix.length;i++){
            isSatisfies = true;
            int m = 1;
            for(int j = 0; j < matrix.length; j++) {
                if(Math.abs(matrix[j][i]) > compareNum) {
                    isSatisfies = false;// Если элемент в столбце не подходит, флаг - false
                    //index = -1;
                } else {
                    m *= matrix[j][i];
                }
            }
            //Printer.print("Mul: " + m);
            if(isSatisfies){
                if(minM > m){
                    minM = m;
                    index = i+1;
                }
            }
        }
        return index;
    }
}
