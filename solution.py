Here is a Python console application that calculates the maximum width of a binary tree:

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def max_width(root):
    if root is None:
        return 0

    max_width = 0
    queue = []
    queue.append(root)

    while queue:
        count = len(queue)
        max_width = max(max_width, count)

        while count > 0:
            temp = queue.pop(0)

            if temp.left:
                queue.append(temp.left)

            if temp.right:
                queue.append(temp.right)

            count -= 1

    return max_width

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.right = Node(8)
root.right.right.left = Node(6)
root.right.right.right = Node(7)

print("Maximum width is %d" %(max_width(root)))
```

This Python console application first defines a class `Node` for the binary tree nodes. Then it defines a function `max_width` to calculate the maximum width of the binary tree. The function uses a queue to perform level order traversal of the binary tree. For each level, it counts the number of nodes and updates the maximum width if the current level has more nodes. Finally, it creates a binary tree and prints the maximum width.