//first come first serve scheduling algorithm non preemptive 
import java.util.*;

public class Fcfs {
    public static void sort(String[] id, int[] at, int[] bt){
        for(int i = 0; i < at.length; i++){
            for(int j = i + 1; j < at.length; j++){
                if(at[i] > at[j]){
                    int temp = at[i];
                    at[i] = at[j];
                    at[j] = temp;
                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;
                    String temp1 = id[i];
                    id[i] = id[j];
                    id[j] = temp1;
                }
            }
        }
    }
    public static void fcfs(String[] id, int[] at, int[] bt, int[] ct, int[] wt, int[] tat){
        int n = at.length;
        ct[0] = at[0] + bt[0];
        tat[0] = ct[0] - at[0];
        wt[0] = tat[0] - bt[0];
        for(int i = 1; i < n; i++){
            ct[i] = ct[i - 1] + bt[i];
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }
        System.out.println("Process ID\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurn Around Time");
        for(int i = 0; i < n; i++){
            System.out.println(id[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + wt[i] + "\t\t" + tat[i]);
        }
    }
    public static void main(String[] args){
        String[] process_id = {"P1", "P2", "P3", "P4", "P5"};
        int[] arrival_time = {0, 1, 2, 3, 4};
        int[] burst_time = {3, 5, 2, 1, 4};
        int[] completion_time = new int[5];
        int[] waiting_time = new int[5];
        int[] turn_around_time = new int[5];
        sort(process_id, arrival_time, burst_time);
        fcfs(process_id, arrival_time, burst_time, completion_time, waiting_time, turn_around_time);
    }
}