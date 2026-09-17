class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {

        const setArr = new Set();

        for( const num of nums ) {

            if( setArr.has(num) ) {
                return true;
            } else {
                setArr.add(num);
            }

        }

        return false;

    }
}
