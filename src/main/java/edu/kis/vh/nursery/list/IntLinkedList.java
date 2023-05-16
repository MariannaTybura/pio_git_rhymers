package edu.kis.vh.nursery.list;

/**
 * Linked list implementation for integers with last element as top of stack
 */
public class IntLinkedList {
    /**
     * Empty node informing if node is empty
     */
    public static final Node EMPTY_NODE = null;
    /**
     * Empty value informing if linked list is empty
     */
    public static final int EMPTY = -1;
    /**
     * Last element of linked list
     */
    private Node last;
    /**
     * temporary variable for top() and pop() methods
     */
    private int i;

    /**
     * @return int i.
     */
    public int getI() {
        return i;
    }

    /**
     * Adds new element at the last position of linked list
     *
     * @param i which will be added at the last position of linked list
     */
    public void push(int i) {
        if (last == EMPTY_NODE)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if linked list is empty
     *
     * @return true if linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == EMPTY_NODE;
    }

    /**
     * Checks if linked list is full
     *
     * @return false because linked list is never full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * returns last element of linked list without removing it from linked list
     *
     * @return last element of linked list
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * returns last element of linked list and removes it from linked list
     *
     * @return last element of linked list
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
