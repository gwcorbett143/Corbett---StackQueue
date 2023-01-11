import java.util.Objects;

public class Node<T> {
    private Node parent;
    private Node child;
    private T data;

    public Node() {
    }


    public Node(T data) {
        this.data = data;
    }

    public Node(Node parent, Node child, T data) {
        this.parent = parent;
        this.child = child;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getParent() {
        return this.parent;
    }

    public Node<T> getChild() {
        return this.child;
    }

    public void setParent(Node parent) {
        this.parent = parent;
        if (parent.getChild() != this) {
            parent.setChild(this);
        }
    }

    public void setChild(Node child) {
        this.child = child;
        if (child.getParent() != this) {
            child.setParent(this);
        }
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "Node: " + data;
    }

    public boolean equals(Node node1, Node node2) {
        if (node1.getData() == node2.getData()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(parent, child, data);
    }
}

