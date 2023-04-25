package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final Node EMPTY = null;
    public static final int ERROR = -1;

    Node last;
    int i;

    public void push(int i) {
        if (last == EMPTY)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
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
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
