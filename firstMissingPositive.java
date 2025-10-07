class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>nums.length || nums[i]<1){
                nums[i] = nums.length+2;
            }
        }
        for (int i = 0;i<nums.length;i++){
            if (nums[i]<nums.length+2 && nums[i]>-nums.length-2){
                if (nums[i]==nums.length || nums[i]==-nums.length){
                    if (nums[0]>0){
                        nums[0] = -nums[0];
                    }
                    continue;
                }
                if (nums[i]>0 && nums[nums[i]]>0){
                    nums[nums[i]] = -nums[nums[i]];
                    continue;
                }
                if (nums[i]<0 && nums[-nums[i]]>0){
                    nums[-nums[i]] = -nums[-nums[i]];
                    continue;
                }
            }
        }
        for (int i = 1;i<nums.length+1;i++){
            if (i==nums.length ){
                if (nums[0]>0){
                    return nums.length;
                }
                break;
            }
            if (nums[i]>0){
                return i;
            }
        }
        return nums.length+1;
    }
}
