package myPractice.linkedList.practice;

/**
 * @Kazunobu Someya
 */
public class SLinkedList {
    SNode head; // original or initial node, but it's empty?

    public SLinkedList(SNode head){
        this.head = head;
    }

    public void addFirst(int newData){
        // make a instance for new node
        SNode node = new SNode(newData);
        // head becomes next node
        node.next = head;
        // new node becomes head
        head = node;
    }

    public void addLast(int newData){
        // make a instance for new node
        SNode newNode = new SNode(newData);

        if(head == null){
            head = newNode;
        }else{
            SNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

//    public void add(int insertAlter, int newData){
//
//    }

    public SNode removeFirst(){
        if(head != null){
            SNode toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }

    public void removeLast(){

    }
}
