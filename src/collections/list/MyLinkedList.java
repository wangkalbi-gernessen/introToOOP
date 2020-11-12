package collections.list;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Singly Linked-list (generic)
 */
public class MyLinkedList<E> {

    private Node<E> head, tail; // null
    private int size; // 0

    public MyLinkedList() { }

    // O(1)
    public void addFirst(E e) { // E is data type, and e is value(data)
        final Node<E> h = head; // h isn't still node, and just was named as "head"
        final Node<E> newNode = new Node<>(e, h); // make new node to the front
        head = newNode; // move the added node to the front
        if (h == null) { // if list is empty
            // adding a new node to the empty linked list
            tail = newNode; // ? Question or head
        }
        size++;
    }

    // O(1)
    public void addLast(E e) {
        final Node<E> t = tail;
        final Node<E> newNode = new Node<>(e, null);
        tail = newNode;
        if (t == null) {
            head = newNode;
        } else {
            t.next = newNode;
        }
        size++;
    }

    // O(N)
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node<>(e, cur.next);
            size++;
        }
    }

    // O(1)
    public E removeFirst() {
        final Node<E> h = head;
        if (h == null) {
            throw new NoSuchElementException("list is empty");
        }

        E data = h.data;
        Node<E> next = h.next;
        h.data = null;
        h.next = null;
        head = next;
        if (next == null) {
            // only one element in the list
            tail = null;
        }
        size--;
        return data;
    }

    // O(1)
    // I wrote following reference
    // https://www.java2novice.com/java-interview-programs/linkedlist-remove-last-node/
    public E removeLast() {
        // TODO: Implement Me;
        final Node<E> h = head;

        if (h == null || h.next == null) {
            throw new NoSuchElementException("list is empty");
        }

        // Find the second last node
        Node<E> secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return (E) h;
    }

    // O(1)
    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException("list is empty");
        }
        return head.data;
    }

    // O(1)
    public E getLast() {
        if (tail == null) {
            throw new NoSuchElementException("list is empty");
        }
        return tail.data;
    }

    private Node<E> getNodeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        Node<E> cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // O(N)
    public E get(int index) {
        return getNodeAt(index).data;
    }

    // O(N)
    public E set(int index, E e) {
        Node<E> cur = getNodeAt(index);
        E oldValue = cur.data;
        cur.data = e;
        return oldValue;
    }

    // O(N)
    public int indexOf(E e) {
        int index = 0;
        if (e == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (e.equals(x.data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    /**
     * Remove the element e from the list
     * @param e
     * @return
     */
    public boolean remove(E e) {
        // e is reference type
        // TODO: Implement Me
        if (head == null) {
            return false;
        } else if (head.data.equals(e)) {
            head = head.next;
            return true;
        } else {
            Node<E> temp = head;
            // temp is null
            while(temp != e){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            System.out.println(head);
            return true;
        }
    }

    /**
     * Remove the element at index
     * O(N)
     * @param index
     * @return
     *
     * I referred to following URL
     * https://gist.github.com/primaryobjects/3ce46599ee5f6639f2ba92d2a1063419
     */
    public boolean remove(int index) {
        // TODO: Implement Me
        if (head == null) {
            return false;
        } else if (index == 0) {
            head = head.next;
            return true;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
//            System.out.println(head);
            return true;
        }
    }


    /**
     * Returns the index of the last occurrence of element e
     * O(N)
     *
     * ll = [1, 1, 2, 3, 1, 5, 1, 2]
     * ll.lastIndexOf(1) -> 6
     * @param e
     * @return the index of the last occurrence of element e
     */
    public int lastIndexOf(E e) {
        // TODO: Implement Me
        int index = 0;
        ArrayList<Integer> num = new ArrayList<>();
        if (e == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (e.equals(x.data)) {
                    num.add(index);
                    index++;
                }
                index++;
            }
            // find max value(index)
            int largest = 0;
            for(int i = 0; i <= num.size() - 1; i++){
                if(num.get(largest) < num.get(i)){
                    largest = i;
                }
            }
            return num.get(largest);
        }
        return -1;
    }

    /**
     * Reverses the current linked list
     * "A" -> "B" -> "C" -> null
     * should be
     * "C" -> "B" -> "A" -> null
     *
     * I referred to following URL
     * https://www.geeksforgeeks.org/reverse-a-linked-list/
     */
    public void reverse() {
        // TODO: Implement Me
        Node<E> curr = head;
        Node<E> prev = null;
        Node<E> forward = null;
        while(curr.next != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = curr;
        head.next = prev;
        System.out.println(head);
    }

    // O(N)
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Node<E> x = head; x != null; x = x.next) {
            s.append(x.data).append(" -> ");
        }
        s.append("null");
        return s.toString();
    }

    public int size() {
        return size;
    }

    // static nested class
    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.data = item;
            this.next = next;
        }
    }
}