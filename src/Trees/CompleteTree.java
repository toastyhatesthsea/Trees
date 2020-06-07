package Trees;

/**
 * Attemps to create a complete binary tree of data
 * @param <E>
 */
public class CompleteTree<E>
{

    public BTNode<E> cursor;
    public BTNode<E> parent;

    public CompleteTree()
    {
        cursor = new BTNode<E>(null, null, null);
        parent = cursor;
    }


    public void add(E someData)
    {
        //Start of node, at root
        if (cursor.getData() == null)
        {
            cursor.setData(someData);
        }
        else if (cursor.isLeaf())
        {
            BTNode<E> newLeft = new BTNode<E>(someData, null, null);
            cursor.setLeft(newLeft);
        }
        else if (cursor.getLeft() != null && cursor.getRight() == null)
        {
            BTNode<E> newRight = new BTNode<E>(someData, null, null);
            cursor.setRight(newRight);

            //At root
            if (cursor == parent)
            {
                cursor = cursor.getLeft();
            }
            else if (parent.getRight().isLeaf())
            {
                cursor = parent.getRight();
            }
        }
    }

}
