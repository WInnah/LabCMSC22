import java.util.Scanner;

/**
 * Created by Winnah Gwen Acal on 12/6/2016.
 */
public class Rule30Thread extends Thread {
    int start;
    int end;
    int[] row;
    int given;
    int[][] twoD;

    public Rule30Thread(int start, int end, int[] row, int given){
        this.start = start;
        this.end = end;
        this.row = row;
        this.given = given;
    }

    public void run(){
        for (int i = start; i < end; i++) {
            for (int j = 0; j < given; j++) {
                if (i == start){
                    if (j - 1 == -1 || row[j - 1] == 0) {
                        if (row[j] == 1 && row[j + 1] == 1)
                            twoD[i][j] = 1;
                        else if (row[j] == 1 && row[j + 1] == 0)
                            twoD[i][j] = 1;
                        else if (row[j] == 0 && row[j + 1] == 1)
                            twoD[i][j] = 1;
                        else
                            twoD[i][j] = 0;
                    } else if (row[j - 1] == 1 || j + 1 == given) {
                        if (row[j] == 1 && row[j + 1] == 1)
                            twoD[i][j] = 0;
                        else if (row[j] == 1 && row[j + 1] == 0)
                            twoD[i][j] = 0;
                        else if (row[j] == 0 && row[j + 1] == 1)
                            twoD[i][j] = 0;
                        else
                            twoD[i][j] = 1;
                    }
                }else{
                    if (j - 1 == -1 || twoD[i][j - 1] == 0) {
                        if (twoD[i][j] == 1 && twoD[i][j + 1] == 1)
                            twoD[i + 1][j] = 1;
                        else if (twoD[i][j] == 1 && twoD[i][j + 1] == 0)
                            twoD[i + 1][j] = 1;
                        else if (twoD[i][j] == 0 && twoD[i][j + 1] == 1)
                            twoD[i + 1][j] = 1;
                        else
                            twoD[i + 1][j] = 0;
                    } else if (twoD[i][j - 1] == 1 || j + 1 == given) {
                        if (twoD[i][j] == 1 && twoD[i][j + 1] == 1)
                            twoD[i + 1][j] = 0;
                        else if (twoD[i][j] == 1 && twoD[i][j + 1] == 0)
                            twoD[i + 1][j] = 0;
                        else if (twoD[i][j] == 0 && twoD[i][j + 1] == 1)
                            twoD[i + 1][j] = 0;
                        else
                            twoD[i + 1][j] = 1;
                    }
                }
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }
    }
}
