# Rebalancing the Tree

If a node becomes unbalanced after an insertion or deletion, rotations are performed to restore balance. There are four types of rotations:

## Left Rotation (LL): 
* Performed when the left subtree is heavier due to an insertion in its left child.

```dbn-psql
before rotation
      30
        \
         40
           \
            50

after rotation

      40
     /  \
    30   50

```

## Right Rotation (RR): 
* Performed when the right subtree is heavier due to an insertion in its right child.
```dbn-psql

Before rotation

      30
     /
    20
   /
  10

After rotation

      20
     /  \
    10   30

```
## Left-Right Rotation (LR):
* A combination of left and right rotations, needed when the left subtree is heavier due to an insertion in its right child.

```dbn-psql

Before Rotation

      30
     /
    10
      \
       20

After Rotation

      30
     /
    20
   /
  10

      20
     /  \
    10   30

```
## Right-Left Rotation (RL):
* A combination of right and left rotations, needed when the right subtree is heavier due to an insertion in its left child.
```dbn-psql
Before rotation

      30
        \
         50
        /
       40
       

After Rotation

      30
        \
         40
           \
            50
            
            
      40
     /  \
    30   50



```