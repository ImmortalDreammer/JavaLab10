package by.bntu.fitr.povt.woradreamteam.individualTasks;

public class Lab12Nastya {

    public int findNumberOfRow(int[][]matrix){
        int maxRepetitions =  calculateRepetitions(matrix[0]);
        int rowNumber = 0;
        for(int i =1; i< matrix.length;i++){
            if(calculateRepetitions(matrix[i])> maxRepetitions){
                   maxRepetitions = calculateRepetitions(matrix[i]);
                   rowNumber = i;
            }
        }
        return rowNumber;
    }

    private int calculateRepetitions(int[] row){
        int bufer = row[0];
        int counter = 0;
        for(int i= 1; i < row.length;i++){
            if(row[i] == bufer){
                counter ++;
            }else{
                bufer = row[i];
                counter = 0;
            }
        }
        return counter;
    }
}
