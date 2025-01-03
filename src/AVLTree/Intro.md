# AVL Tree

An **AVL Tree** is a self-balancing binary search tree that maintains its height balance by ensuring that the height difference (balance factor) between the left and right subtrees of any node is within a specific range.

## Key Properties

1. **Height-Balanced**: An AVL tree ensures that the height difference between the left and right subtrees of every node is at most 1.
2. **Efficient Operations**: Maintaining balance ensures that AVL trees have logarithmic time complexity for insertion, deletion, and lookup operations.

## Balance Factor

The **Balance Factor (BF)** of a node is calculated as:

```math
BF = Height of Left Subtree - Height of Right Subtree
```

* Balanced Node: If |BF| ≤ 1, the node is balanced.
* Unbalanced Node: If |BF| > 1, the node is unbalanced and requires rebalancing.
* Every node in the AVL tree must satisfy the balance condition.