import java.util.ArrayList;
/**
 *
 * @author Rey
 */
public class TreeNode {
    TreeNode parent;
    double distance;
    ArrayList<TreeNode> children;
    int data;

    public TreeNode(int new_data) {
        this.data = new_data;
        this.parent = null;
        this.distance = 0.0;
        this.children = new ArrayList<TreeNode>();
    }

    /* set this node's parent into new parent
    * set this node's distance into distance
    * if this node's parent is not nul, then add this as parent's child
    */
    void set_parent(TreeNode new_parent, double distance) {

        if (this.parent != null) {

        }
    }
    
    // alias to set_parent(new_parent, 0)
    void set_parent(TreeNode new_parent) {
        this.set_parent(new_parent, 0);
    }

    /* call new_child.set_parent. The new parent of new_child should be this
    * The distance of new_child should be set to distance
    */
    void add_child(TreeNode new_child, double distance) {

    }
    
    /* Simply remove child from this node's children */
    void remove_child(TreeNode child) {

        this.children.remove(child);
    }
    
    /* print this node's data, this node's distance, and distance + this node's distance
    * for each of this node's children, recursively call child's print method
    */
    void print(String spaces, double distance) {

        for (int i = 0; i < this.children.size(); i++) {

        }
    }

    void print() {
        this.print("", 0);
    }
}
