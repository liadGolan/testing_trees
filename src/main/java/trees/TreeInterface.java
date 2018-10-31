package trees;

interface TreeInterface<A>
{
    public A getRootContents();

    public Node<A> getNode();
    
    public TreeInterface<A> getLeftChild();

    public TreeInterface<A> getRightChild();

    public void setRightChild(Node<A> node);

    public void setLeftChild(Node<A> node);

    public TreeInterface<A> returnNewTree(Node<A> node);

}