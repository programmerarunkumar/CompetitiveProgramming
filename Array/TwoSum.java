
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int value=0;
        int length = nums.length;
        int result[] = new int[2];
        
        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int i=0;i<length;i++){
          
            value=target-nums[i];
            if(map.containsKey(value)){
                result[0]=i;
                result[1]=map.get(value);
                break;
            }else{
                map.put(nums[i],i);
            }

        }
        
        return result;
        
    }
    
}
