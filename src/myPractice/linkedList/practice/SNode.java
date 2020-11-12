package myPractice.linkedList.practice;

/**
 * this is node object
 * @Kazunobu Someya
 */
public class SNode {
    int data; // value included in head box
    SNode next; // link to next box or next box

    // constructor (= node or box)
    public SNode(int data){
        this.data = data; // given data
        this.next = null; // this node is empty (= not node)
    }

}
