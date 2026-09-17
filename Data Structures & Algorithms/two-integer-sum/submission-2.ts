class Solution {
    twoSum(nums: number[], target: number): number[] {


        for( let i = 0; i < nums.length; i++ ) {

            const v = target - nums[i];

            const has = nums.indexOf(v, i + 1);

            if( has !== -1 ) {
                return [ i, has ];
            }

        }
        
        return [];

    }
}
