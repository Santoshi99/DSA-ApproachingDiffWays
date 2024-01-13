public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
      for(int i =0;i<32;i++){
          if((n&1)==1) {
             count++;
          }
          n= n>>1;
      }
       
       return count;
    }
}
O(1) , O(1)= constant
==================

  public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       if(n==0) return 0;
        return (n&1)+hammingWeight(n>>>1);
    }
}
O(logn) and O(logn)
============

  
