/*
https://leetcode.com/problems/combination-sum/

Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

*/


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> s = new ArrayList();
        dfs(s,candidates,0,new ArrayList(),target);
        return s;
        
    }
    
    public void dfs(List<List<Integer>> s , int [] candidates, int index , List<Integer> current,int target)
    {
        if(target<0)
            return;
        if(target==0)
        {
            s.add(new ArrayList(current));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            current.add(candidates[i]);
            dfs(s,candidates,i,current,target-candidates[i]);
            current.remove(current.size()-1);
        }
    }
        
    
}