class Solution {
    public List<List<Integer>>subsets(int[] nums) {
        
        List<List<Integer>> s = new ArrayList();
        dfs(s,nums,0,new ArrayList());
        return s;
        
    }
    
    public void dfs(List<List<Integer>> s , int [] nums, int index , List<Integer> current)
    {
        s.add(new ArrayList(current));
        for(int i=index;i<nums.length;i++)
        {
            current.add(nums[i]);
            dfs(s,nums,i,current);
            current.remove(current.size()-1);
        }
    }
}





