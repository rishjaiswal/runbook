
/*
https://leetcode.com/problems/permutations-ii/


Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example:

Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> s = new ArrayList();
        Arrays.sort(nums);
        boolean used[]=new boolean[nums.length];
        dfs(s,nums,0,new ArrayList(),used);
        return s;
        
    }
    
    public void dfs(List<List<Integer>> s , int [] nums , int index,List<Integer> current,boolean[] used)
    {
        if(current.size()==nums.length)
        {
            s.add(new ArrayList(current));
            return;
        }    
        for(int i=index;i<nums.length;i++)
        {

            if(used[i]==true)
                continue;
            if(i>index && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]);
            used[i]=true;
            dfs(s,nums,i,current,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}



