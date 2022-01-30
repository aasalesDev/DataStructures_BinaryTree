package datastructurestrees;

public class BinaryNode<T> implements Comparable<T> {

    private T content;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;

    public BinaryNode(T content) {
        this.content = content;
        this.leftNode = this.rightNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinaryNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "content=" + content +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
