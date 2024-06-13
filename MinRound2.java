import java.util.*;

class MinRound2 {

    public static void main(String[] args) {
        int[] tasks={2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));
    }

    public static  int minimumRounds(int[] tasks) {
        int count=0;
        Arrays.sort(tasks);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> position=new ArrayList<>();
        list.add(tasks[0]);
        position.add(0);
        for(int i=0;i<tasks.length;i++){
            boolean ck=list.contains(tasks[i]);
            if(ck==false){
                list.add(tasks[i]);
                position.add(i);
            }
        }

        int size= list.size();
        for(int i=0;i<size;i++){
            int a= list.get(i);
            int b=position.get(i);
            int count2=check(tasks,a,b);
            if(count2==-1){
                return -1;
            }else{
                count+=count2;
            }
        }

        return count;
    }

    public static  int check(int[] arr, int num, int index){
        int c=0;
        for(int i=index;i<arr.length;i++){
            if(arr[i]==num){
                c++;
                arr[i]=-1;                
            }            
        }
        if(c>=2){
            return c%3==0?c/3:(c/3)+1;
        }else{
            return -1;
        }
        
    }
}