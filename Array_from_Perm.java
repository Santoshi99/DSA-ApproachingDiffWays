class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            int temp = nums[i];
            nums[i] = (nums[i]+n*(nums[nums[i]]%n));
        
        }
        for(int i=0;i<n;i++){
            nums[i] = (nums[i]/n);
        }
        return nums;
    }

}
O(1) space O(n) time
=====
O(n) space O(n) time

  class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int newarr = new int[n];
        for(int i =0;i<n;i++){
           newarr[i] = nums[nums[i]];
        }
       
        return newarr;
    }

}

=========
Masking 

  public int[] buildArray(int[] nums) {
	int mask = 1023; // Decimal value of the binary number '1111111111'
	
	for(int i = 0; i < nums.length; i++) {
		nums[i] |= (nums[nums[i]] & mask) << 10;
	}
	
	for(int i = 0; i < nums.length; i++) {
		nums[i] = nums[i] >> 10;
	}
	
	return nums;
}


=================
extra stack space 

class Solution {
    public int[] buildArray(int[] nums) {
        perm(nums,0);
        return nums;
    }

    void perm(int nums[], int start){
        if(start<nums.length){
          int temp = nums[nums[start]];
          perm(nums,start+1);
          nums[start] = temp;
        }
    }

}

