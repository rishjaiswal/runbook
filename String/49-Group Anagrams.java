class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    if(strs.length==0)
        return new ArrayList();
        
    HashMap<String,List<String>> hm = new HashMap();
    for(String x : strs)
    {
        char[] a = x.toCharArray();
        Arrays.sort(a);
        String s= new String(a);
        if(hm.containsKey(s))
            hm.get(s).add(x);
        else
        {
            List<String> al =new ArrayList();
            al.add(x);
            hm.put(s,al);
        }
    }

    return new ArrayList(hm.values());
        
    }
}