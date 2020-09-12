
class Solution {
    
    public int removeDuplicates(int[] nums) {
        
        int length=nums.length;
        if(length == 0 || length == 1){
            return length;
        }else{
            int temp=nums[0];
            int originalLength=1;
            for(int i=1;i<length;i++){
                if(temp != nums[i]){
                    temp=nums[i];
                    nums[originalLength++]=nums[i];
                }
            }
            return originalLength;
        }
        
    }
    
}
