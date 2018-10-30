package trees;

import static org.junit.Assert.assertEquals;
import trees.*;
import org.junit.Test;
import java.util.*;

public class TreeOperationsTest {
    /**
     * Breadth First Search Tests
     */
    @Test
    public void testBreadthFirstSearchOrganizes1NodeCorrectly()
    {
        Node<Integer> root = new Node<Integer>(new Integer(7), null, null);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        assertEquals(list, TreeOperations.breadthFirstSearch(tree));
    }

    @Test
    public void testBreadthFirstSearchOrganizes3NodesCorrectlyInABalancedTree()
    {
        Node<Integer> right = new Node<Integer>(new Integer(4), null, null);
        Node<Integer> left = new Node<Integer>(new Integer(5), null, null);
        Node<Integer> root = new Node<Integer>(new Integer(7), left, right);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        list.add(left.contents);
        list.add(right.contents);
        assertEquals(list, TreeOperations.breadthFirstSearch(tree));
    }

    @Test
    public void testBreadthFirstSearchOrganizes4NodesCorrectlyInAnInBalancedTree()
    {
        Node<Integer> rightTwo = new Node<Integer>(new Integer(4), null, null);
        Node<Integer> left = new Node<Integer>(new Integer(5), null, null);
        Node<Integer> rightOne = new Node<Integer>(new Integer(6), left, rightTwo);
        Node<Integer> root = new Node<Integer>(new Integer(7), null, rightOne);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        list.add(rightOne.contents);
        list.add(left.contents);
        list.add(rightTwo.contents);
        assertEquals(list, TreeOperations.breadthFirstSearch(tree));
    }
    /**
     * pre-Order Traversal Tests
     */

    @Test
    public void testPreOrderTraversalReturns1NodeCorrectly()
    {
        Node<Integer> root = new Node<Integer>(new Integer(7), null, null);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        assertEquals(list, TreeOperations.preOrderTraversal(tree));
    }

    @Test
    public void testPreOrderTraversalReturns3NodesInABalancedTreeCorrectly()
    {
        Node<Integer> right = new Node<Integer>(new Integer(4), null, null);
        Node<Integer> left = new Node<Integer>(new Integer(5), null, null);
        Node<Integer> root = new Node<Integer>(new Integer(7), left, right);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        list.add(left.contents);
        list.add(right.contents);
        assertEquals(list, TreeOperations.preOrderTraversal(tree));
    }

    @Test
    public void testPreOrderTraversalReturns7NodesInABalancedTreeCorrectly()
    {
        Node<Integer> rightOne = new Node<Integer>(new Integer(1), null, null);
        Node<Integer> leftOne = new Node<Integer>(new Integer(2), null, null);
        Node<Integer> rightTwo = new Node<Integer>(new Integer(3), null, null);
        Node<Integer> leftTwo = new Node<Integer>(new Integer(4), null, null);
        Node<Integer> baseRight = new Node<Integer>(new Integer(5), leftTwo, rightTwo);
        Node<Integer> baseLeft = new Node<Integer>(new Integer(6), leftOne, rightOne);
        Node<Integer> root = new Node<Integer>(new Integer(7), baseLeft, baseRight);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.contents);
        list.add(baseLeft.contents);
        list.add(leftOne.contents);
        list.add(rightOne.contents);
        list.add(baseRight.contents);
        list.add(leftTwo.contents);
        list.add(rightTwo.contents);
        assertEquals(list, TreeOperations.preOrderTraversal(tree));
    }

    /**
     * Maximum Depth Tests
     */
    @Test
    public void testMaximumDepthReturns1WhenDepthOneNodeIsInTheTree()
    {
        Node<Integer> root = new Node<Integer>(new Integer(7), null, null);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        assertEquals(1, TreeOperations.maximumDepth(tree));
    }

    @Test
    public void testMaximumDepthReturns2WhenBranchNodeIsOnlyLeftAreInTheTree()
    {
        Node<Integer> left = new Node<Integer>(new Integer(7), null, null);
        Node<Integer> root = new Node<Integer>(new Integer(7), left, null);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        assertEquals(2, TreeOperations.maximumDepth(tree));
    }

    @Test
    public void testMaximumDepthReturns2WhenBranchNodeIsOnlyRightAreInTheTree()
    {
        Node<Integer> right = new Node<Integer>(new Integer(7), null, null);
        Node<Integer> root = new Node<Integer>(new Integer(7), null, right);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        assertEquals(2, TreeOperations.maximumDepth(tree));
    }

    @Test
    public void testMaximumDepthReturns2WhenBranchNodesAreBothLeftAndRightInTheTree()
    {
        Node<Integer> right = new Node<Integer>(new Integer(7), null, null);
        Node<Integer> left = new Node<Integer>(new Integer(7), null, null);
        Node<Integer> root = new Node<Integer>(new Integer(7), left, right);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        assertEquals(2, TreeOperations.maximumDepth(tree));
    }

    @Test
    public void testMaximumDepthReturns3WhenBranchNodesAreMixed()
    {
        Node<Integer> right = new Node<Integer>(new Integer(7), null, null);
        Node<Integer> left = new Node<Integer>(new Integer(7), null, right);
        Node<Integer> root = new Node<Integer>(new Integer(7), left, right);
        TreeInterface<Integer> tree = new TreeWrapper<Integer>(root);
        assertEquals(3, TreeOperations.maximumDepth(tree));
    }
}
