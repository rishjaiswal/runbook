/*
https://leetcode.com/problems/permutations/

Given a collection of distinct integers, return all possible permutations.
Example:
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
      List<List<Integer>> al = new ArrayList();
        
        helper(al,nums,new ArrayList());
        return al;
    
}
    
    public void helper(List<List<Integer>> al, int[] nums, List<Integer> current)
    {
        if(current.size()==nums.length)
        {
            al.add(new ArrayList(current));
        }
        for(int i=0;i<nums.length;i++)

        {
            if(current.contains(nums[i]))
                continue;
            current.add(nums[i]);

            helper(al,nums,current);
            current.remove(current.size()-1);
       
        }
    }
}