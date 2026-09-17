class Solution {
    public static int longestConsecutive(int[] nums) {

        if( nums.length < 2 ) return nums.length;

        Arrays.sort(nums);

        int count = 1;

        int curr = nums[0];

        int max = 0;

        for (int num : nums) {
            if (num != curr) {
                if (num == curr + 1) {
                    curr = num;

                    count++;

                } else {
                    max = Math.max(count, max);

                    count = 1;
                }

                curr = num;
            }
        }

        max = Math.max(count, max);

        return max;
    }
}
