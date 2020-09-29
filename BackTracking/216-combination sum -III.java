/*
https://leetcode.com/problems/combination-sum-iii/

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

 

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
*/


class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> s = new ArrayList();
        dfs(s,k,1,new ArrayList(),n);
        return s;
        
    }
    
    public void dfs(List<List<Integer>> s , int k, int index , List<Integer> current,int n)
    {
        if(n<0)
            return;
        if(n==0 && current.size()==k)
        {
            s.add(new ArrayList(current));
            return;
        }
        for(int i=index;i<10;i++)
        {
            current.add(i);
            dfs(s,k,i+1,current,n-i);
            current.remove(current.size()-1);
        }
    }
}