package trees;

import java.util.*;

public class TreeOperations {
    public static <A> ArrayList<A> breadthFirstSearch(TreeInterface<A> tree) {
       ArrayList<A> endResult = new ArrayList<A>();
       LinkedList<TreeInterface<A>> queue = new LinkedList<TreeInterface<A>>();
       queue.add(tree);
       while(queue.size() > 0) {
           TreeInterface<A> temp = queue.poll();
           if(temp.getLeftChild()!=null) {
               queue.add(temp.getLeftChild());
           }
           if(temp.getRightChild()!=null) {
               queue.add(temp.getRightChild());
           }
           endResult.add(temp.getRootContents());
       }
       return endResult;
    }

    public static <A> ArrayList<A> preOrderTraversal(TreeInterface<A> tree)
    {
        ArrayList<A> orderedList = new ArrayList<A>();
        Stack<TreeInterface<A>> stack = new Stack<TreeInterface<A>>();
        stack.push(tree);
        while(!stack.empty()) {
            TreeInterface<A> temp = stack.pop();
            if(temp != null) {
                orderedList.add(temp.getRootContents());
                stack.push(temp.getRightChild());
                stack.push(temp.getLeftChild());
            }
        }

        return orderedList;
    }

    public static <A> int maximumDepth(TreeInterface<A> tree)
    {
        int leftDepth = 0;
        TreeInterface<A> leftTree = tree.getLeftChild();
        if(leftTree != null) {
            leftDepth = maximumDepth(tree.getLeftChild());
        }
        int rightDepth = 0;
        TreeInterface<A> rightTree = tree.getRightChild();
        if(rightTree != null) {
            rightDepth = maximumDepth(tree.getRightChild());
        }
        int maximumDepth = ((leftDepth >= rightDepth) ? leftDepth : rightDepth);
        return 1 + maximumDepth;
    }
}
