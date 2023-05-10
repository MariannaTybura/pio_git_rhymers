package edu.kis.vh.nursery.list;

class IntLinkedList {

    public static final Node EMPTY = null;
    public static final int ERROR = -1;
  
    private Node last;
    private int i;

    public int getI() {
        return i;
    }

    public void push(int i) {
        if (last == EMPTY)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == EMPTY;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
