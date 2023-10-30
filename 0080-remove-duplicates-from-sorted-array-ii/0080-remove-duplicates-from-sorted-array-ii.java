class Solution {
    public int removeDuplicates(int[] nums) {
        int left=2, right; 
        for(right=2; right<nums.length; right++){
                if(nums[left-1]==nums[right]){
                    if(nums[left-1]==nums[left-2]) continue;
                    nums[left++]=nums[right]; continue;
                }
                if(nums[left-1]!=nums[right])
                    nums[left++]=nums[right];
            }
        return left;    
    }
}