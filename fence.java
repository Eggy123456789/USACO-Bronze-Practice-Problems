import java.util.*;
import java.io.*;

public class fence {
    public static void main(String[] args) throws IOException {
        String input = "7 10 4 8";
        Scanner in = new Scanner(input);
        int [] inArr = new int [4];
        int max = 0;
        int min = 101;
        boolean overlap = true;
        for(int i = 0; i < inArr.length; i++){
            int temp = in.nextInt();
            inArr[i] = temp;
        }
        if(inArr[2]>inArr[1]){
            overlap = false;
        } else if(inArr[3]<inArr[0]){
            overlap = false;
        }
        //System.out.println(Arrays.toString(inArr));
        in.close();
        int result = 0;
        if(overlap==true) {
            for (int i = 0; i < inArr.length; i++) {
                int num = inArr[i];
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            result = max-min;
        } else {
            int john = inArr[1]-inArr[0];
            int bessie =  inArr[3]-inArr[2];
            result = john+bessie;
        }

        System.out.println(result);
    }
}
