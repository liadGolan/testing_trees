package trees;

public class Node<A> {
    public final A contents;
    public Node<A> left;
    public Node<A> right;

    public Node(final A contents,
                final Node<A> left,
                final Node<A> right) {
        this.contents = contents;
        this.left = left;
        this.right = right;
    }
}
