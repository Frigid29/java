import java.util.*;
public class HashMapFinal<K, V> {
    private class Entity{
        K key;
        V value;
        public Entity(K key, V value){
            this.key = key;
            this.value= value;
        }
    }

    ArrayList<LinkedList<Entity>> list;
    private int size=0;
    private float lf=0.75f;

    public HashMapFinal(){
        list=new ArrayList<>();
        for(int i=0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> block= list.get(index);
        for(Entity entity: block){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        if((float)size / list.size()> lf){
            rehash();
        }
        block.add(new Entity(key, value));
        size++;
    }

    private void rehash(){
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        for(int i=0; i<old.size() *2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> e : old){
            for(Entity entry: e){
                put(entry.key, entry.value);
            }
        }
    }

    public void remove(K key){
        int index = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> block= list.get(index);
        Entity target=null;
        for(Entity entity: block){
            if(entity.key.equals(key)){
                target=entity;
                break;
            }
        }
        block.remove(target);
        size--;
    }

    public V get(K key){
        int index = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> block= list.get(index);
        for(Entity entity: block){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("{");
        for(LinkedList<Entity> e: list){
            for(Entity pos: e){
                sb.append(pos.key + ":" + pos.value + ", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        System.out.println(map.get("4"));
        System.out.println(map);
    }
}
