
import java.io.*;
import java.util.*;

public class friday {
    public static void main(String [] args) throws IOException{
        File f = new File("C:\\friday.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String Sinpt = br.readLine();
        //how many years to run code
        int inpt = Integer.parseInt(Sinpt);
        int year = 1900;
        //arrays for days in month
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Monday to Sunday!
        int[] dayCount = {0,0,0,0,0,0,0};
        //0-6 (0 is Monday)
        int weekDay = 0;
        int date = 1;
        for(int i = 0; i < inpt; i ++) {
            if (year % 4 == 0) {

                if(year%100 != 0){
                    //standard leap year code
                    for(int j = 1; j < 13; j++){
                        //System.out.println(j+"=");
                        for(int a = 0; a < leapDays[j-1]; a++){


                            if(date == 13){
                                dayCount[weekDay]++;
                            }
                            //System.out.println(weekDay);
                            if(weekDay==6){
                                weekDay = 0;
                            } else {
                                weekDay = weekDay+1;
                            }
                            date= date+1;
                            //System.out.println(a);
                        }
                        date = 1;
                    }



                } else {
                    if(year % 400 == 0){
                        for(int j = 1; j < 13; j++){
                            //System.out.println(j+"=");
                            for(int a = 0; a < leapDays[j-1]; a++){


                                if(date == 13){
                                    dayCount[weekDay]++;
                                }
                                //System.out.println(weekDay);
                                if(weekDay==6){
                                    weekDay = 0;
                                } else {
                                    weekDay = weekDay+1;
                                }
                                date= date+1;
                                //System.out.println(a);
                            }
                            date = 1;
                        }
                    } else {
                        for(int j = 1; j < 13; j++){
                            //System.out.println(j+"=");
                            for(int a = 0; a < monthDays[j-1]; a++){


                                if(date == 13){
                                    dayCount[weekDay]++;
                                }
                                //System.out.println(weekDay);
                                if(weekDay==6){
                                    weekDay = 0;
                                } else {
                                    weekDay = weekDay+1;
                                }
                                date= date+1;
                                //System.out.println(a);
                            }
                            date = 1;
                        }
                    }
                }

            } else {
                //regular year
                for(int j = 1; j < 13; j++){
                    //System.out.println(j+"=");
                    for(int a = 0; a < monthDays[j-1]; a++){


                        if(date == 13){
                            dayCount[weekDay]++;
                        }
                        //System.out.println(weekDay);
                        if(weekDay==6){
                            weekDay = 0;
                        } else {
                            weekDay = weekDay+1;
                        }
                        date= date+1;
                        //System.out.println(a);
                    }
                    date = 1;
                }

            }



            year = year +1;
        }

        //prints out in correct order
        System.out.print(dayCount[5]);
        System.out.print(" "+dayCount[6]);
        System.out.print(" "+ dayCount[0]);
        System.out.print(" "+dayCount[1]);
        System.out.print(" "+dayCount[2]);
        System.out.print(" "+dayCount[3]);
        System.out.print(" "+dayCount[4]);
    }


}
