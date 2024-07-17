import java.util.*;
public class Rpg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of monsters: ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter the initial experience: ");
        int exp=sc.nextInt();
        System.out.println();
        ArrayList<Integer> power=new ArrayList<>();
        ArrayList<Integer> bonus=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the power of monster "+(i+1)+": ");
            power.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.print("Enter the bonus exp for defeating the monster "+(i+1)+": ");
            bonus.add(sc.nextInt());
        }
        int ans=0;
        int i=0;
        while(true){
            if(ans>=n){
                break;
            }
            int add=turn(power, exp, bonus);
            int size=power.size();
            if(add==-1){
                break;
            }else{
                ans+=1;
                exp=add;
            }
        }
        System.out.println(ans);
    }
    public static int turn(ArrayList<Integer> monster, int cexp, ArrayList<Integer> gain){
        int size=monster.size();
        for(int i=0;i<size;i++){
            if(cexp>=monster.get(i)){
                cexp=cexp+gain.get(i);
                monster.remove(i);
                gain.remove(i);
                return cexp;
            }
        }
        return -1;
    }
}
