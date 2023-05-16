package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final Node EMPTY_NODE = null;
    public static final int EMPTY = -1;
  
    private Node last;
    private int i;

    public int getI() {
        return i;
    }

    public void push(int i) {
        if (last == EMPTY_NODE)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == EMPTY_NODE;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
