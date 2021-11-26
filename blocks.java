import java.util.Scanner;
import java.io.*;
import java.util.*;


public class blocks {
    public static void main(String [] args) throws IOException {
        String input = "3 fox box dog cat car bus";
        Scanner in = new Scanner(input);
        int length = in.nextInt();
        int[] answer = new int [26];
        int[] word1 = new int [26];
        int[] word2 = new int [26];
        String[] letters = new String[length*2];
        for(int i = 0; i < length*2; i ++){
            String t = in.next();
            letters[i] = t;
        }
        int e = 0;
        int o = 1;
        for(int i = 0; i < length; i++){

            String sec = letters[o];
            String fir = letters[e];
            for(int j = 0; j < fir.length(); j++){
                //use word1 and fir
                char t = fir.charAt(j);
                int ghb = (int) t;
                int ind = ghb-97;
                word1[ind] = word1[ind] +1;
            }
            for(int j = 0; j < fir.length(); j++){
                //use word2 and sec
                char t = sec.charAt(j);
                int ghb = (int) t;
                int ind = ghb-97;
                word2[ind] = word2[ind] +1;
            }
            e=e+2;
            o=o+2;

            for(int j = 0; j < answer.length; j++){
                int w1 = word1[j];
                int w2 = word2[j];
                if(w1>w2){
                    answer[j] = answer [j]+w1;
                }else if(w2>w1){
                    answer[j] = answer [j]+w2;
                } else {
                    answer[j] = answer [j]+w2;
                }
            }
            Arrays.fill(word1, 0);
            Arrays.fill(word2, 0);
        }
        for(int i = 0; i < answer.length; i++){
            int aa = answer[i];
            System.out.println(aa);
        }

    }
}
