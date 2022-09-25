class Solution {
    public int removeDuplicates(int[] nums) {
        // int count=0;
        // for(int i=1;i<nums.length;i++){
            // if(nums[count]!=nums[i]){
                // count++;
                // nums[count]=nums[i];
            // }
            // }
        
    // return count+1; }
    int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
    
    
    
   return i+1; }
}