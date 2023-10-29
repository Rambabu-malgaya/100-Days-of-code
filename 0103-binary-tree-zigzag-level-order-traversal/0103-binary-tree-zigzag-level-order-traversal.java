/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode p=null;
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        Deque<TreeNode>q=new LinkedList<>();
        int level=0;
        q.push(root);
        List<Integer>b=new ArrayList<>();
        while(q.isEmpty()==false)
        {
            int n=q.size();
            if(level%2==0)
            {
                for(int i=0;i<n;i++)
                {
                    p=q.getFirst();
                    b.add(p.val);
                    q.removeFirst();
                    if(p.left!=null)q.addLast(p.left);
                    if(p.right!=null)q.addLast(p.right);
                }
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    p=q.getLast();
                    b.add(p.val);
                    q.removeLast();
                    if(p.right!=null)q.addFirst(p.right);
                    if(p.left!=null)q.addFirst(p.left);
                }
            }
            ans.add(b);
            b=new ArrayList<>();
            level+=1;
        }
        return ans;
    }
}