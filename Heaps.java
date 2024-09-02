import java.util.ArrayList;
class Heaps<T extends Comparable<T>>{
    //min heap
    private ArrayList<T> list;
    public Heaps(){
        list = new ArrayList<>();
    }

    public void swap(int first, int sec){
    T temp = list.get(first);
    list.set(first, list.get(sec));
    list.set(sec,temp);
    }

    private int parent(int i){
    return (i-1)/2;
    }

    private int left(int i){
        return (i*2) +1;
    }

    private int  right(int i){
        return (i*2) +2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index){
        if(index==0){
            return;
        }
        int parentIndex = parent(index);
        if(list.get(index).compareTo(list.get(parentIndex))<0){
            //in the above if block: if index's value is smaller than parent's value then ans will be <0. for eg 5-10<0
            swap(index,parentIndex);
            upheap(parentIndex);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Heap is empty");
        }
        T value = list.get(0);
        T last=list.remove(list.size()-1);
        if(list.size()>0){
            list.set(0,last);
            downheap(0);
        }
        return value;
    }

    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);

        if(left<list.size() && list.get(left).compareTo(list.get(min))<0){
            //let left=5, min=10;
            min=left;
        }
        if(right<list.size() && list.get(right).compareTo(list.get(min))<0){
            //let left=5, min=10;
            min=right;
        }
        if(min!=index){
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapsort() throws Exception{
        if(list.isEmpty()){
            throw new Exception("heap is empty");
        }
        ArrayList<T> sortedList = new ArrayList<>();
        while(!list.isEmpty()){
            sortedList.add(remove());
        }
        return sortedList;
        //time complexity is O(N logN)
    }

    public static void main(String[] args) throws Exception{
        Heaps<Integer> heap = new Heaps<Integer>();
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(5);
        heap.insert(30);
        heap.insert(25);
        heap.insert(35);
        heap.insert(40);
        System.out.println(heap.remove());
        ArrayList<Integer> sorted=heap.heapsort();
        System.out.println(sorted);
    }

}