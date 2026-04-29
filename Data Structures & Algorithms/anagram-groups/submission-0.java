class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String w : strs){
            char[] c = w.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(w);
        }
        return new ArrayList<>(m.values());
    }
}
