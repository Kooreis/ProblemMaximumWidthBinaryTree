public class BinaryTree
{
    Node root;

    public int getMaxWidth(Node node)
    {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;

        for (i = 1; i <= h; i++)
        {
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }
}