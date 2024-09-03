import java.util.*;
class hashmapss{
    public static void main(String[] args) {

        //hashmap
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Akash", 99);
        map.put("Rahul", 98);
        map.put("Kunal", 88);
        System.out.println(map); //{Rahul=98, Kunal=88, Akash=99}
        System.out.println(map.get("Akash")); //99
        System.out.println(map.getOrDefault("Akki",33)); //33
        System.out.println(map.containsKey("karan")); //false

        //hashset
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set); //[20, 10, 30]

    }
}