import java.util.ArrayList;
public class Heaps2<T extends Comparable<T>>{
    //max heap
    private ArrayList<T> list;
    public Heaps2(){
        list = new ArrayList<>();
    }

    //swap
    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
    }
    //parent
    private int parent(int i){
        return (i-1)/2;
    }
    //left 
    private int left(int i){
        return (2*i)+1;
    }
    //right
    private int right(int i){
        return (2*i)+2;
    }
    //insert
    public void insert(T i){
        list.add(i);
        upheap(list.size()-1);
    }
    private void upheap(int i){
        if(i==0){
            return;
        }
        int parent=parent(i);
        if(list.get(i).compareTo(list.get(parent))>0){
            swap(i,parent);
            upheap(parent);
        }
    }
    //remove and returns the top element
    public T remove() throws Exception{
        if(list.size()==0){
            throw new Exception("heap is empty");
        }
        T value=list.get(0);
        T last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return value;
    }
    private void downheap(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;
        if(left<list.size() && list.get(left).compareTo(list.get(largest))>0){
            largest=left;
        }
        if(right<list.size() && list.get(right).compareTo(list.get(largest))>0){
            largest=right;
        }
        if(largest!=i){
            swap(i,largest);
            downheap(largest);
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
        Heaps2<Integer> heap = new Heaps2<Integer>();
        heap.insert(4);
        heap.insert(1);
        heap.insert(3);
        heap.insert(2);
        heap.insert(16);
        heap.insert(9);
        heap.insert(10);
        heap.insert(14);
        heap.insert(8);
        heap.insert(7);
        ArrayList<Integer> sorted=heap.heapsort();
        System.out.println(sorted);
    }

}
