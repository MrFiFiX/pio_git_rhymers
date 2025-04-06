package edu.kis.vh.nursery.list;

public class Node {  

    private final int valueNode;
    private Node prevNode;
    private Node nextNode;

    public Node(int i) {
        valueNode = i;
    }

    public int getValueNode() {
        return valueNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}