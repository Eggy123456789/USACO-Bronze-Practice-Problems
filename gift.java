

import java.util.*;
import java.io.*;

public class gift {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\gift1.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\gift2.txt")));
        String s = null;
        Map<String, Integer> hm = new TreeMap<>();
        String pNum = br.readLine();
        int ipnum = Integer.parseInt(pNum);
        String[] sort;
        sort = new String[ipnum];
        //fills map with names of friends
        for(int j = 0; j < ipnum; j++){
            s = br.readLine();
            hm.put(s, 0);
            sort[j] = s;
        }
        //System.out.println(Arrays.toString(sort));
        for(int y = 0; y < ipnum; y++) {
            //determines receiver and subtracts money
            String giver = br.readLine();
            StringTokenizer st = new StringTokenizer((br.readLine()));
            int money = Integer.parseInt(st.nextToken());
            int numReceivers = Integer.parseInt(st.nextToken());
            int val = (int) hm.get(giver);
            if(numReceivers!=0) {
                int moneyGiven = val - money + money % numReceivers;
                hm.put(giver, moneyGiven);
            } else {

            }

            //gives money to receivers
            for (int i = 0; i < numReceivers; i++) {
                String receiver = br.readLine();
                int currentVal = hm.get(receiver);
                int monReceived = money / numReceivers;
                hm.put(receiver, currentVal+monReceived);

            }
        }
        //outputs answer in correct order
        for(int k = 0; k < ipnum; k ++){
            int out1 = hm.get(sort[k]);
            String keyy = sort[k];
            System.out.println(keyy + " " + out1);
        }
    }
}
