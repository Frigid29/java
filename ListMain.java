public class ListMain {
    public static void main(String[] args) {
        SortList node=new SortList();
        node.insert(41);
        node.insert(2);
        node.insert(33);
        node.insert(1);
        node.insert(11);
        node.insert(10);
        //head=node.sortList(node.head);
        //node.display();
        //ListNode ans=sortList(head);
        //node.reverseList();
        node.display();
        node.BubbleSort();
        node.display();
    }
}
