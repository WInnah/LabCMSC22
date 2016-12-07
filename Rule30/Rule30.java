import java.util.Scanner;

/**
 * Created by Winnah Gwen Acal on 12/7/2016.
 */
public class Rule30 {
    final static int THREAD_COUNT = 10;

    public static void print(int given) {
        int twoD[][] = new int[given][given];
        int[] current = new int[given];
        int[] next = new int[given];
        int i = 0;

        for (int j = 0; j < given; j++) {
            if (j != given / 2)
                twoD[i][j] = 0;
            else
                twoD[i][j] = 1;
            System.out.print(twoD[0][j]);
            current[j] = twoD[0][j];
        }
        System.out.println();




        Rule30Thread[] worker = new Rule30Thread[THREAD_COUNT];
        int wpt = given/THREAD_COUNT;
        int pwa = given%THREAD_COUNT;

        for (int k = 1; k < given; k++){
            int start = 0;
            for( i = 0; i < THREAD_COUNT; i++) {
                if(i < pwa) {
                    worker[i] = new Rule30Thread(start,wpt + 1, current, given);
                    start = start + wpt + 1;
                } else {
                    worker[i] = new Rule30Thread(start, wpt, current, given);
                    start = start + wpt;
                }
            }

            for( i = 0; i < THREAD_COUNT; i++) {
                worker[i].start();
            }

            for( i = 0; i < THREAD_COUNT; i++) {
                while(worker[i].isAlive()) {
                    try {
                       worker[i].join();
                    } catch(InterruptedException e) {
                        System.err.println("thread interrupted: " + e.getMessage());
                    }
                }
            }


        }
    }
}
