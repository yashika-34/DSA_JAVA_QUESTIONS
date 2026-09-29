class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        preorderHelper(root);
        return ans;
    }

    private void preorderHelper(Node root) {
        if (root == null) {
            return;
        }

        ans.add(root.val);
        if (root.children != null) {
            for (Node child : root.children) {
                preorderHelper(child);
            }
        }
    }
}
