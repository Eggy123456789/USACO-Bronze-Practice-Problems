import java.io.*;
import java.util.*;

public class diamonds {
    public static void main(String [] args) throws IOException {
        boolean check = false;
        String input = "2 1 1 5";
        Scanner in = new Scanner(input);
        int answer = 0;
        int length = in.nextInt();
        int diff = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> bads = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            int temp = in.nextInt();
            nums.add(temp);
            bads.add(0);
        }
        for(int e = 0; e < length - 1; e ++) {
            for (int i = 0; i < nums.size(); i++) {
                int d = nums.get(i);

                for (int j = 0; j < nums.size(); j++) {
                    int d2 = nums.get(j);
                    int h = d - d2;
                    int c = Math.abs(h);

                    if (c > diff) {
                        int t = bads.get(i) + 1;
                        bads.set(i, t);
                    }
                }

            }
            for(int v = 0; v < bads.size(); v++){
                int q = bads.get(v);
                if(q>0){
                    check = true;
                }
            }
            int rEle = 0;
            int rMax = 0;
            //System.out.println(bads);
            //System.out.println(check);
            if(check==true) {
                for (int i = 0; i < bads.size(); i++) {
                    int temp = bads.get(i);
                    if (temp > rMax) {
                        rMax = temp;
                        rEle = i;
                    }
                }

                nums.remove(rEle);
                bads.remove(rEle);
            }
            check = false;
            for(int w = 0; w < bads.size(); w++){
                bads.set(w, 0);
            }
        }
        //System.out.println(nums);
        //System.out.println(bads);
        //nums.toString();
        //bads.toString();
        //System.out.println(nums.size());
    }
}
