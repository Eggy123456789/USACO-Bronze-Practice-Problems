import java.io.*;
import java.util.*;

public class balancing {
    public static void main(String[] args) throws Exception {
        String input = "7 10 7 3 5 5 9 7 3 1 7 7 5 3 9 1";
        Scanner in = new Scanner(input);
        int nCows = in.nextInt();
        int mx = in.nextInt();
        int yx = mx;
        int [] cowX = new int [nCows];
        int [] cowY = new int [nCows];
        int max = 1000000000;
        for(int i = 0; i < nCows; i++){
            cowX[i] = in.nextInt();
            cowY[i] = in.nextInt();
        }


        for(int i = 0; i < nCows; i++){
            int fx = cowX[i]+1;
            int fy = cowY[i]+1;

            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            int s4 = 0;

            for(int j = 0; j < nCows; j++){
                int tx = cowX[j];
                int ty = cowY[j];
                if(tx<fx && ty <fy){
                    s1 = s1+1;
                } else if(tx<fx && ty>fy){
                    s2 = s2+1;
                } else if(tx>fx && ty>fy){
                    s3 = s3+1;
                } else {
                    s4 = s4+1;
                }
                //do stuff here


            }
            int sMax = s1;
            if (s2 > sMax) {
                sMax = s2;
            }
            if (s3 > sMax) {
                sMax = s3;
            }
            if (s4 > sMax) {
                sMax = s4;
            }
            if(sMax<max){
                max=sMax;
            }

        }
        System.out.println(max);
    }
}
