class Solution {
    public int getCon(int n)
    {
        int con=0;
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
                n=(3*n)+1;
            }
            con++;
        }
        return con;
    }
    public int getKth(int lo, int hi, int k) {
        int arr[][]=new int[hi-lo+1][2];
        int j=0;
        for(int i=lo;i<=hi;i++)
        {
            arr[j][0]=getCon(i);
            arr[j++][1]=i;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0])
            {
                return a[1]-b[1];
            }
            else
            {
                return a[0]-b[0];
            }
        });
        return arr[k-1][1];
    }
}