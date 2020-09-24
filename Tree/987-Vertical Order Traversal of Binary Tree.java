//Data Structure to keep height on each Node
class TreeData
{
    TreeNode current;
    int i;
    TreeData(TreeNode root, int height)
    {
        current=root;
        i=height;
    }
    
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,List<Integer>>hm = new TreeMap();
        List<List<Integer>> al = new ArrayList();
        traversal(root,hm);
        al.addAll(hm.values());
        return al;
       
    }
    
    public void traversal(TreeNode  root,TreeMap<Integer,List<Integer>> hm)
    {
        if (root == null) return;
    
 
        LinkedList<TreeData> l = new LinkedList<>();  
        l.add(new TreeData(root,0));


        while (!l.isEmpty()) 
        {

            int height = l.peek().i;
            TreeNode curr= l.peek().current;
            l.remove();

            List<Integer> list = hm.get(height);
            if (list == null) 
            {
                list = new ArrayList<>();
                hm.put(height, list);
            }
            list.add(curr.val);

            if (curr.left != null) 
            {
                l.add(new TreeData(curr.left,height-1));
            }

            if (curr.right != null) 
            {
                l.add(new TreeData(curr.right,height+1));
            }
        }
        
        
    }
}