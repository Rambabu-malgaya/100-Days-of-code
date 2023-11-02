class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
     long add=0,sub=0;
     for(int i=0;i<nums1.length;i++)
     {
         if(k==0&&nums1[i]!=nums2[i])return -1;
         if(nums1[i]==nums2[i])continue;
         else if(nums1[i]<nums2[i]){
             int val1=nums2[i]-nums1[i];
             if(val1%k==0)add+=(val1/k);
             else return -1;
         }else{
             int val2=nums1[i]-nums2[i];
             if(val2%k==0)sub+=(val2/k);
             else return -1;
         }
     }
     return add==sub?add:-1;  
    }
}