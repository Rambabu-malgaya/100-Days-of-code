class Solution {
    public int jump(int[] nums) {
        int max_i = 0;
        int steps = 0;
        int count = nums[0];
        int i = 0;

        if(nums.length == 1) {
            return 0;
        }

        while(i < nums.length) {
            if(count >= nums.length - (i + 1)) {
                 steps++;
                 break;
            }

            max_i = max(nums, i+1, i + nums[i]+1);

            i = max_i;

            count = nums[i];
            steps++;

        }

        return steps;
    }
    public int max(int[] arr, int start, int end) {
        int max = arr[start];
        int index = 0;
        while(start < end) {
            if(max <= arr[start] + start) {
                max = arr[start] + start;
                index = start;
            }
            start++;
        }
        return index;
    }
}