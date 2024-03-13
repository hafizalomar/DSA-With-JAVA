package Tree.simpleTree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        TreeNode milkTea = new TreeNode("milk tea");
        TreeNode greenTea = new TreeNode("Green tea");
        TreeNode blackTea = new TreeNode("Black tea");

        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        tea.addChild(milkTea);
        tea.addChild(greenTea);
        tea.addChild(blackTea);
        System.out.println(drinks.print(0));
    }
}
