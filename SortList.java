/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SortList {
    ListNode head;
    ListNode tail;
    int size=0;
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right= sortList(mid);
        return merge(left,right);        
    }
    public ListNode middleNode(ListNode head) {
        // this s giving us the middle node, and making middle.prev.next=null;
        ListNode midprev=null;
        while(head!=null && head.next!=null){
            midprev=(midprev==null)?head:midprev.next;
            head=head.next.next;
        }
        ListNode mid=midprev.next;
        midprev.next=null;
        return mid;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode ans= new ListNode();
        ListNode tail=ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
                tail=tail.next;
            }else{
                tail.next=l2;
                l2=l2.next;
                tail=tail.next;
            }            
        }
        tail.next=(l1!=null)?l1:l2;
        return ans.next;
    }
    class ListNode{
        private int val;
        private ListNode next;
        ListNode(){            
        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void insert(int val){
        if(head==null){
            head=new ListNode(val);
            tail=head;
        }else{
            ListNode temp=new ListNode(val);
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    public void reverseList() {
        if( head==null){
            return;
        }
        if(head.next==null){
            return;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }
    public ListNode get(int index){
        ListNode node=head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void BubbleSort(){
        BubbleSort(size-1,0);
    }
    public void BubbleSort(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            ListNode first=get(col);
            ListNode second=get(col+1);
            if(first.val>second.val){
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==tail){
                    tail=first;
                    ListNode prev=get(col-1);
                    prev.next=second;
                    first.next=null;
                    second.next=tail;
                }else{
                    ListNode prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }                                
            }  
            BubbleSort(row,col+1);          
        }else{
            BubbleSort(row-1,0);
        }
    } 
    public void reverseRec(){
        ListNode temp=head;
        reverseRec(temp);
    }
    private void reverseRec(ListNode node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseRec(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
        return;
    }
    
    public int getMid(){
        return getMid(head).val;
    }
    public ListNode getMid(ListNode node){
        ListNode s=node;
        ListNode f=node;
        while(f!=null&& f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

//https://leetcode.com/problems/reverse-linked-list-ii/submissions/1297961680/


    public void reverseBetween(){
        reverseBetween(head,2,4);
    }
    public void reverseBetween(ListNode head, int left , int right){
        ListNode prev=null;
        ListNode current=head;
        for(int i=0;i<left-1 && current!=null ;i++){
            prev=current;
            current=current.next;
        }
        ListNode last=prev;
        ListNode newend=current;
        ListNode next=current.next;
        for(int i=0;i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newend.next=current;
        //return head;
    }

    //https://leetcode.com/problems/palindrome-linked-list/description/
    public boolean isPalindrome(){
        return isPalindrome(head);
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=getMid(head);
        ListNode secondHead=mid;
        reverseRec(secondHead);
        ListNode reversehead=secondHead;
        while(head!=null && secondHead!=null){
            if(head.val!=secondHead.val){
                break;
            }
            head=head.next;
            secondHead=secondHead.next;
        }
        reverseRec(reversehead);;
        if(head!=null && secondHead!=null){
            return true;
        }
        return false;
    }
}


