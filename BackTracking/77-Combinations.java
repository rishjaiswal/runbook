class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> al =new ArrayList();
        helper(al,n,k,1,new ArrayList());
        return al;
    }
    
    public void helper(List<List<Integer>> al , int n , int k , int index,List<Integer>current)
    {
    
        if(current.size()==k)
        {
            al.add(new ArrayList(current));
            return;
        }
            
        
        for(int i=index;i<=n;i++)
        {
            current.add(i);
            helper(al,n,k,i+1,current);
            current.remove(current.size()-1);
        }
    }
}