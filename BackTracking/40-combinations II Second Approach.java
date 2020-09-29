/*
https://leetcode.com/problems/combination-sum-ii/

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]

*/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
 
        List<List<Integer>> al = new ArrayList();
        Arrays.sort(candidates);
        helper(al,new ArrayList(),target,0,candidates);
        return al;
    }
    
    public void helper(List<List<Integer>> al,List<Integer> current,int target,int index,int [] candidates)
    {
        if(target<0)
            return;
        if(target==0)
        {
            if(!al.contains(new ArrayList(current)))
                al.add(new ArrayList(current));
            return;
        }
            
        for(int i=index;i<candidates.length;i++)
        {
            current.add(candidates[i]);
            helper(al,current,target-candidates[i],i+1,candidates);
            current.remove(current.size()-1);
            
        }
        
    }
}