package struct;

/**
 * 以K-V键值对的形式表示
 * @param <K>
 * @param <V>
 */
public class RBNode<K extends Comparable<K>, V> {
    //定义颜色常量
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    //颜色
    public boolean color;
    //左子节点
    public RBNode left;
    //右子节点
    public RBNode right;
    //父节点
    public RBNode parent;
    //key
    public K key;
    //value
    public V value;

    public RBNode(boolean color, RBNode left, RBNode right, RBNode parent, K key, V value) {
        this.color = color;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.key = key;
        this.value = value;
    }

    public RBNode() {
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public RBNode getLeft() {
        return left;
    }

    public void setLeft(RBNode left) {
        this.left = left;
    }

    public RBNode getRight() {
        return right;
    }

    public void setRight(RBNode right) {
        this.right = right;
    }

    public RBNode getParent() {
        return parent;
    }

    public void setParent(RBNode parent) {
        this.parent = parent;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    /*****************************************************************************
     * Print Method
     *****************************************************************************/


    public void padding ( String ch, int n ) {
        int i;
        for ( i = 0; i < n; i++ )
            System.out.printf(ch);
    }

    /**
     *
     * @param root
     * @param level
     */
    void print_node (RBNode root, int level ) {
        if ( root == null ) {
            padding ( "\t", level );
            System.out.println( "NIL" );

        } else {
            print_node ( root.right, level + 1 );
            padding ( "\t", level );
            if(root.color == BLACK) {
                System.out.printf(root.key + "(" + (root.isColor() ? "红" : "黑") +")" + "\n");
            } else
                System.out.printf(root.key  + "(" + (root.isColor() ? "红" : "黑") +")" + "\n");
            print_node ( root.left, level + 1 );
        }
    }
}
//    void print_tree() {
//        print_node(this.root,0);
//        System.out.printf("-------------------------------------------\n");
//    }

