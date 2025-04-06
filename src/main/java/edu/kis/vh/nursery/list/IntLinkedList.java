package edu.kis.vh.nursery.list;

public class IntLinkedList {

    protected static class Node {

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

    private Node lastNode;
    private int currentIndex;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
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
        return lastNode.getValueNode();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNode.getValueNode();
        lastNode = lastNode.getPrevNode();
        return ret;
    }

}
