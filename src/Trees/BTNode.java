package Trees;

public class BTNode<E>
{

    public E data;
    public BTNode<E> left;
    public BTNode<E> right;

    public BTNode(E data, BTNode<E> left, BTNode<E> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public E getData()
    {
        return data;
    }

    public void setData(E data)
    {
        this.data = data;
    }

    public BTNode<E> getLeft()
    {
        return left;
    }

    public void setLeft(BTNode<E> left)
    {
        this.left = left;
    }

    public BTNode<E> getRight()
    {
        return right;
    }

    public void setRight(BTNode<E> right)
    {
        this.right = right;
    }

    public boolean isLeaf()
    {
        return left == null && right == null;
    }

    public boolean isFull()
    {
        return left != null && right != null;
    }

    public static BTNode getMostLeft(BTNode someNode)
    {
        if (someNode.isLeaf())
        {
            return someNode;
        } else
        {
            if (someNode.getLeft() != null)
            {
                someNode = someNode.getLeft();
                return getMostLeft(someNode);
            } else
            {
                return someNode;
            }

        }
    }
}
