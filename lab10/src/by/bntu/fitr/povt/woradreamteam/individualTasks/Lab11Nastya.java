package by.bntu.fitr.povt.woradreamteam.individualTasks;


public class Lab11Nastya {

    public double calculateMaxEl(double [] array){
        double max = array[0];
        for (int i = 1; i< array.length; i++) {
            if(array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }

    private int findLastPos(double [] array){
        int lastPos = 0;
        for (int i = 0; i< array.length; i++) {
            if(array[i] > 0){
                lastPos = i;
            }
        }
        return lastPos;
    }

    public double calculateSumBeforeLastPositive(double [] array){
        double sum = 0;
        for (int i = 0; i< findLastPos(array); i++) {
            sum += array[i];
        }
       return sum;
    }

}
