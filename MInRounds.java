//https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/

class MInRounds {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] tasks) {
        int count=0;
        for(int i=0;i<tasks.length;i++){
            int a=tasks[i];
            int ans=check(tasks, a, i);

            if((a!=-1)&&(ans==-1)){
                return -1;
            }
            if((a!=-1)){
                count+=ans;
            }
        }
        return count;
    }

    public static int check(int[] arr, int num, int index){
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
