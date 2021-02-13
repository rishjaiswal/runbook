
/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

Given a binary search tree (BST), find the lowest common ancestor (LCA)
 of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest 
common ancestor is defined between two nodes p and q as the 
lowest node in T that has both p and q as descendants 
(where we allow a node to be a descendant of itself).”

*/
import java.util.*;

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    
    if(p.val < root.val  && q.val < root.val)
        return lowestCommonAncestor(root.left,p,q);
    else if(p.val > root.val  && q.val > root.val)
        return lowestCommonAncestor(root.right,p,q);
    else
        return root; 
}

}
//Time Complexity - o(h) 
//Space Complexity - o(1)