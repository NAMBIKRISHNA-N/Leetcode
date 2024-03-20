class Solution {
    int Max(int arr[],int ind,int dp[])
    {
        if(ind>=arr.length)
        return 0;

        if(dp[ind]!=-1)
        return dp[ind];

        int p=arr[ind]+Max(arr,ind+2,dp);
        int np=Max(arr,ind+1,dp);
        return dp[ind]=Math.max(p,np);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return Max(nums,0,dp);
    }
}