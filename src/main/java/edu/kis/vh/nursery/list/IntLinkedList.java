package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node lastNode;
    private int currentIndex;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.nextNode = new Node(i);
            lastNode.nextNode.prevNode = lastNode;
            lastNode = lastNode.nextNode;
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return lastNode.valueNode;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.valueNode;
        lastNode = lastNode.prevNode;
        return ret;
    }

}
