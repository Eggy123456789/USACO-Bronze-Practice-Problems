import java.io.*;
import java.util.*;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("C:\\beads.in.txt"));
        //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

        int nb = Integer.parseInt(f.readLine());
        char [] beads = new char[nb];
        int[] streaks = new int[nb];
        String beadsin = f.readLine();
        for(int i = 0; i < nb; i++){
            beads[i] = beadsin.charAt(i);
        }

        for(int i = 0; i < nb; i++){
            char bead = beads[i];
            //System.out.println(bead);
            int index = i;
            //System.out.println(i);
            int counter = 0;
            char beadaccept = '_';
            boolean undecided = true;
            while((beads[index] == bead || beads[index] == 'w' || beads[index]==beadaccept || undecided) && counter < nb){
                if(beads[index] != 'w'){
                    beadaccept = beads [index];
                    undecided = false;
                }
                index += 1;
                index %= nb;
                counter++;
            }
            streaks[i] = counter;
        }



        int max = 0;
        for(int i = 0; i < streaks.length; i++){
            int tmp = streaks[i] + streaks[(i + streaks[i]) % nb];
            if(tmp > max){
                max = tmp;
            }
        }
        if(max > nb){
            max = nb;
        }

        //System.out.println(Arrays.toString(streaks));
    }
}
