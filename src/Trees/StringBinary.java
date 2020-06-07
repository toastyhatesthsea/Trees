package Trees;

public class StringBinary
{
    public BTNode <String> root;

    public StringBinary()
    {
        root = new BTNode<>(null, null, null);
    }

    public void add(String someData)
    {
        if (root.getData() == null)
        {
            BTNode<String> tempers = new BTNode<>(someData, null, null);
        } else if (root.isLeaf())
        {
            BTNode<String> temp = new BTNode<>(someData, null, null);
            if (someData.compareToIgnoreCase(root.getData()) < 0)
            {
                root.setLeft(temp);
            }
            else
            {
                root.setRight(temp);
            }
        }
        else
        {
            BTNode<String> oldRoot = root;
            if (someData.compareToIgnoreCase(root.getData()) < 0)
            {
                root = root.getLeft();
            }
            else
            {
                root = root.getRight();
            }
            add(someData);
            root = oldRoot;
        }
    }


}
