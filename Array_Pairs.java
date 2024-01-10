class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                  count++;
                }
            }
        }
        return count;
    }
}

O(n^2)
  =======================
O(n) and O(n) 
 public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>1){
                count+=(e.getValue()*(e.getValue()-1))/2;
            }
        }
        return count;
    }

==========
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i : nums) {
            res += map.getOrDefault(i, 0);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return res;
    }
}
