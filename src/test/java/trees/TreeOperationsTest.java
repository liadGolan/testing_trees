package trees;

import static org.junit.Assert.assertEquals;
import trees.*;
import org.junit.Test;

import java.nio.channels.NotYetBoundException;
import java.util.*;

public class TreeOperationsTest {
    final int MIN_NODES = 0;
    final int MAX_NODES = 100;

    public static TreeInterface<Integer> generateTree(int numberOfNodes, Random random) {
        if (numberOfNodes <= 0) {
            return null;
        } else {
            int numLeft = random.nextInt(numberOfNodes);
            int numRight = numberOfNodes - numLeft - 1;
            assert(numLeft >= 0);
            assert(numRight >= 0);
            TreeInterface<Integer> leftTree = generateTree(numLeft, random);
            Node<Integer> leftNode = null;
            if(leftTree != null) {
                leftNode = leftTree.getNode();
            }
            TreeInterface<Integer> rightTree = generateTree(numRight, random);
            Node<Integer> rightNode = null;
            if(rightTree != null) {
                rightNode = rightTree.getNode();
            }
            TreeInterface<Integer> tree = new TreeWrapper<Integer>(
                new Node<Integer>(
                    new Integer(12), 
                    leftNode,
                    rightNode));
            return tree;
        }
    }

    @Test
    public void testNodeCount() {
        Random random = new Random();
        for (int i = MIN_NODES; i <= MAX_NODES; i++) {
            TreeInterface<Integer> tree = generateTree(i, random);
            assertEquals(TreeOperations.nodeCount(tree), i);
        }
    }
}
