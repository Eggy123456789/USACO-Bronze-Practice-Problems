import java.io.*;
import java.util.*;

public class cowsignalreverse {
    public static void main(String [] args) throws IOException {
        String input = "5 4 2 XXX. X..X XXX. X..X XXX.";
        Scanner in = new Scanner(input);
        int lines = in.nextInt();
        int lineLength = in.nextInt();
        int amplify = in.nextInt();
        String[] words = new String [lines];
        String[] answer = new String [lines*amplify];
        for(int i = 0; i < lines; i++){
            words[i] = in.next();
        }
        //System.out.println(Arrays.toString(words));
        int it2 = 0;
        for(int i = 0; i < lines; i++){
            String trs = words[i];
            char[] charArr = trs.toCharArray();
            int it = 0;

            char[] tem = new char [lineLength*amplify];
            for(int j = 0; j < lineLength; j++){

                for(int k = 0; k < amplify; k++){
                    tem[it] = charArr[j];
                    it=it+1;
                }
            }
            String b = new String(tem);
            //System.out.println(b);
            for(int e = 0; e < amplify; e++){
                answer[it2] = b;
                it2++;
                //System.out.println(b);
            }

        }
        //System.out.println(Arrays.toString(answer));
        for (int i = answer.length-1; i >= 0; i--){
            String an = answer[i];
            String reverse = new StringBuffer(an).reverse().toString();
            System.out.println(reverse);
        }

    }
}
