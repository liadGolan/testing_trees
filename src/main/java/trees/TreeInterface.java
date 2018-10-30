package trees;

interface TreeInterface<A>
{
    public A getRootContents();
    
    public TreeInterface<A> getLeftChild();

    public TreeInterface<A> getRightChild();

    public TreeInterface<A> returnNewTree(Node<A> node);

}