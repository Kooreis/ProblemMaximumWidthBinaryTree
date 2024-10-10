Here is a Java console application that calculates the maximum width of a binary tree:

```java
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    int getMaxWidth(Node node) {
        if (node == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int count = queue.size();
            maxWidth = Math.max(maxWidth, count);

            while (count-- > 0) {
                Node temp = queue.remove();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return maxWidth;
    }
}

public class Main {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        System.out.println("Maximum width is " + tree.getMaxWidth(tree.root));
    }
}
```

This program creates a binary tree and calculates its maximum width. The maximum width of a binary tree is the maximum number of nodes in one level of the tree. The program uses a queue to perform a level order traversal of the tree, and it keeps track of the maximum number of nodes it encounters at any level.