class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int max=0;
        for(int k=0;k<s.length/2 +1;k++)
        {
        int j=1;
        int sum=0;
        for(int i:s)
        {
            System.out.print(i+" ");
            sum=sum+(i*j);
            j++;
        }
        if(max<sum)
        {
            max=sum;
        }
        for(int i=1;i<s.length;i++)
        {
            s[i-1]=s[i];
        }
        s[s.length-1]=0;
        }
        if(max>0)
        {
            return max;
        }
        return 0;
    }
}