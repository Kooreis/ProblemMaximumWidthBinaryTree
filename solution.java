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