import java.util.*;
import java.io.*;

public class outofplace {
    public static void main(String[] args) throws Exception {
        String input = "6 2 4 7 7 9 3";
        Scanner in = new Scanner(input);
        int nCows = in.nextInt();
        int [] cows = new int [nCows];
        int [] sCows = new int [nCows];
        for(int i = 0; i < nCows; i++){
            int t = in.nextInt();
            cows[i] = t;
            sCows[i] = t;
        }
        Arrays.sort(sCows);
        int differences = 0;
        for(int i = 0; i < nCows; i++){
            if(sCows[i]!=cows[i]){
                differences = differences +1;
            }
        }
        System.out.println(differences-1);
    }
}