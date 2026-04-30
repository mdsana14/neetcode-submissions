class Solution {
    List<List<Integer>> r = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        bt(0,nums,target);
        return r;
    }
    private void bt(int id,int[] nums,int target){
        if(target == 0){
            r.add(new ArrayList<>(t));
            return ;
        }
        for(int i=id;i<nums.length;i++){
            if(nums[i] > target) continue;
            t.add(nums[i]);
            bt(i,nums,target - nums[i]);
            t.remove(t.size() - 1);
        }
    }
}
