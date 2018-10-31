package trees;

import java.util.*;

public class TreeOperations {
    public static <A> int nodeCount(TreeInterface<A> tree) {
        int count = 0;
        Stack<TreeInterface<A>> stack = new Stack<TreeInterface<A>>();
        stack.push(tree);
        while(!stack.empty()) {
            TreeInterface<A> temp = stack.pop();
            if(temp != null) {
                count++;
                if(temp.getLeftChild() != null) {
                    stack.push(temp.getLeftChild());
                }
                if(temp.getRightChild() != null) {
                    stack.push(temp.getRightChild());
                }
            }
        }

        return count;
    }
}
