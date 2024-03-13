package Tree.simpleTree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        String result = "\t".repeat(level) + data + "\n";
        for (TreeNode node : this.children) {
            result += node.print(level+1);
        }
        return result;
    }

}
