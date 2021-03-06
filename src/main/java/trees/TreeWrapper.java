package trees;

class TreeWrapper<A> implements TreeInterface<A>
{
    private Node<A> node;
    
    public TreeWrapper (Node<A> node) {
        this.node = node;
    }

	public A getRootContents() {
		return this.node.contents;
	}

	public TreeWrapper<A> getLeftChild() {
		if(this.node.left != null) {
			return this.returnNewTree(this.node.left);
		} else {
			return null;
		}		
	}

	public TreeWrapper<A> getRightChild() {
		if(this.node.right != null) {
			return this.returnNewTree(this.node.right);
		} else {
			return null;
		}
	}
	public TreeWrapper<A> returnNewTree(Node<A> node){
		return new TreeWrapper<A>(node);
	}

	
}