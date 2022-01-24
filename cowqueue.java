import java.util.*;
import java.io.*;

public class cowqueue {
    public static void main(String[] args) throws Exception {
        String input = "3 2 1 8 3 5 7";
        Scanner in = new Scanner(input);
        int lines = in.nextInt();
        Cow[] arr = new Cow[lines];
        for(int i = 0; i < lines; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = new Cow(a,b);
        }
        Arrays.sort(arr);
        in.close();
        // TODO: use Arrays.sort() on the cows

        int time = arr[0].pTime+arr[0].aTime;
        for(int i = 1; i < arr.length; i++){

            System.out.println(time);
            if(arr[i].aTime>time) {
                time = time + arr[i].aTime - time + arr[i].pTime;
            } else {
                time = time + arr[i].pTime;
            }


        }
        PrintWriter out = new PrintWriter(new File("cowqueue.out"));
        System.out.println(time);
        out.println(time);
        out.close();
    }

    static class Cow implements Comparable<Cow> {
        int aTime;
        int pTime;

        public Cow(int x, int y){
            aTime = x;
            pTime = y;
        }

        public int compareTo(Cow other) {
            // TODO: return:
            //   x<0 if this should sort BEFORE the other
            //   x>0 if this should sort AFTER the other
            //   0 if they are equivalent for sorting
            // where x is any number meeting the condition
            if(this.aTime<other.aTime){
                return -1;
            }
            if(this.aTime> other.aTime){
                return 1;
            } else{
                if(this.pTime<other.pTime){
                    return -1;
                }
                if(this.pTime> other.pTime){
                    return 1;
                } else{
                    return 0;
                }
            }

        }
    }
}
