class Solution {
    public void moveZeroes(int[] nums) {
         int[] nums1=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums1[count]=nums[i];
                count++;
            }

        }
        for(int i=count;i<nums.length;i++){
            nums1[i]=0;
       }
    for(int i=0;i<nums.length;i++){
        nums[i]=nums1[i];
    }
    }
}