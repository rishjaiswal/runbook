class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        
        List<List<Integer>> s = new ArrayList();
        Arrays.sort(nums);
        dfs(s,nums,0,new ArrayList());
        return s;
        
    }
    
public void dfs(List<List<Integer>> s , int [] nums, int index , List<Integer> current)
    {
        s.add(new ArrayList(current));
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]);
            dfs(s,nums,i+1,current);
            current.remove(current.size()-1);
        }
    }
}