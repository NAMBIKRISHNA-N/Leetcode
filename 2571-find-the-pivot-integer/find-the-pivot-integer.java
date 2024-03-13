class Solution {
    public int pivotInteger(int n) {
        int ls[]=new int[n];
        ls[0]=1;
        for(int i=1;i<n;i++)
        {
            ls[i]=ls[i-1]+(i+1);
        }
        int rs=0;
        for(int j=n;j>0;j--)
        {
            rs+=j;
            if(ls[j-1]==rs)
            return j;
        }
        return -1;
    }
}