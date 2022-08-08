class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        
        int[] temp = new int[n];
        Arrays.fill(temp,1);
        
        int ans=1;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && temp[i]<=temp[j]){
                    temp[i]=temp[j]+1;
                }
            }
            if(ans<temp[i]) ans=temp[i];
        }
        return ans;
    }
}