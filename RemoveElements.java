class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(val != nums[i]){
                   nums[k] = nums[i];
                   k++; 
            }
        }
        return k;
    }
}
