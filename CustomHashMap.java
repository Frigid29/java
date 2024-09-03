import java.util.*;
import java.math.*;
public class CustomHashMap<T extends Comparable<T>> {
    private class Entity<T extends Comparable<T>>{
        T key;
        T value;
        public Entity(T key, T value){
            this.key = key;
            this.value = value;
        }
    }
    private Entity[] data;
    public CustomHashMap(){
        data = new Entity[100];
    }

    public void put(T key, T value){
        int hash=Math.abs(key.hashCode()%data.length);
        data[hash]=new Entity(key, value);
    }

    public Object get(T key){
        int hash = Math.abs(key.hashCode()%data.length);
        if(data[hash]!=null && data[hash].key.equals(key)){
            Object val= data[hash].value;
            return val;
        }
        return null;
    }

    public void remove(T key){
        int hash = Math.abs(key.hashCode()%data.length);
        if(data[hash]!=null && data[hash].key.equals(key)){
            data[hash]=null;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String> map = new CustomHashMap<String>();
        map.put("key1", "value1");
        map.put("key2", "value5");
        map.put("key22", "value551");
        map.put("key3", "value16");
        System.out.println(map.get("key3"));
        map.remove("key3");
        System.out.println(map.get("key3"));
    }
}
