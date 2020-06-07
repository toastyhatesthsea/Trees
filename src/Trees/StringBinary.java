package Trees;

public class StringBinary
{
    public BTNode<String> root;

    public StringBinary()
    {
        root = new BTNode<>(null, null, null);
    }

    public void add(String someData)
    {
        if (root.getData() == null)
        {
            root.setData(someData);
        } else if (root.isLeaf())
        {
            BTNode<String> temp = new BTNode<>(someData, null, null);
            if (someData.compareToIgnoreCase(root.getData()) < 0)
            {
                root.setLeft(temp);
            } else
            {
                root.setRight(temp);
            }
        } else
        {
            BTNode<String> oldRoot = root;
            if (someData.compareToIgnoreCase(root.getData()) < 0)
            {
                try
                {
                    root = root.getLeft();
                } catch (Exception e)
                {
                    BTNode<String> temp = new BTNode<>(someData, null, null);
                    root.setLeft(temp);
                }
            } else
            {
                try
                {
                    root = root.getRight();
                } catch (Exception e)
                {
                    BTNode<String> temp = new BTNode<>(someData, null, null);
                    root.setRight(temp);
                }
            }
            add(someData);
            root = oldRoot;
        }
    }
}

class StringBinaryTesters
{
    public static void main(String[] asasas)
    {
        StringBinary aTree = new StringBinary();

        aTree.add("c");
        aTree.add("a");
        aTree.add("b");
        aTree.add("D");

    }
}
