class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            int count=0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]<=mid){
                    count++;
                }
            }            
            if (count>mid){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
}