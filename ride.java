
/*
ID: zeyubai1
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

public class ride  {
    public static void main(String[] args) throws IOException {
        String input1 = "";
        String input2 = "";
        BufferedReader bf = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        StringTokenizer comet = new StringTokenizer(bf.readLine());
        StringTokenizer group = new StringTokenizer(bf.readLine());
        while(comet.hasMoreTokens()) {
            input1 = input1 + comet.nextToken().toString();
        }
        while(group.hasMoreTokens()) {
            input2 = input2 + group.nextToken().toString();
        }

        String myStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char idx = 'A';
        int idx2 = 0;
        int answer = 1;
        for(int i = 0; i < input1.length(); i++){
            idx = input1.charAt(i);
            idx2 = myStr.indexOf(idx);
            idx2++;
            answer = idx2*answer;

        }

        char id = 'A';
        int id2 = 0;
        int ans = 1;
        for(int i = 0; i < input1.length(); i++){
            id = input2.charAt(i);
            id2 = myStr.indexOf(id);
            id2++;
            ans = id2*ans;

        }
        ans = ans%47;
        answer = answer%47;
        if(ans==answer){
            out.println("GO");
        } else {
            out.println("STAY");
        }
    out.close();
    bf.close();
    }
}
