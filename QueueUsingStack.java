import java.util.*;
 //https://leetcode.com/problems/implement-queue-using-stacks/ 
 //232


class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStack(){
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    //INSERT EFFICIENT
    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception{
        if(first.isEmpty()){
            throw new Exception("Queue is empty");
        }else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed=second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }       
    }
    public int peek()throws Exception{
       if(first.isEmpty()){
        throw new Exception("Queue is empty");
       }else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peeked=second.peek();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
       }        
    }

    //REMOVAL EFFICIENT
    public void add2(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove2() throws Exception{
        if(first.isEmpty()){
            throw new Exception("Queue is empty");
        }else{
            return first.pop();
        }
    }
    public int peek2()throws Exception{
        if(first.isEmpty()){
            throw new Exception("Queue is empty");
        }else{
            return first.peek();
        }
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args){
        QueueUsingStack obj= new QueueUsingStack();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        try{
            System.out.println(obj.remove());
        }
        catch( Exception e){
            System.out.println(e.getMessage());
        } 
    }
}