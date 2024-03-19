class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int con=0;
        int i=0;
        int j=p.length-1;
        while(i<=j)
        {
            if(p[i]+p[j]<=l)
            {
                i++;
            }
            con++;
            j--;
        }
        return con;
    }
}