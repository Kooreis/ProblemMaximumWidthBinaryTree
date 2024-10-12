def max_width(root):
    if root is None:
        return 0

    max_width = 0
    queue = []
    queue.append(root)