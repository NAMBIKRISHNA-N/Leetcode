class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            max=Math.max(max,i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        long con=0;
        int i=0;
        int j=0;
        long ans=0;
        while(j<nums.length)
        {
            if(nums[j]==max)
            {
                con++;
            }

            while(k==con)
            {
                if(nums[i]==max)
                con--;
                i++;
            }
            j++;
            ans+=i;
        }
        return ans;
    }
}