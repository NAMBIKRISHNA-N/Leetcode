class Solution {
    public int candy(int[] ratings) {
        int arr[]=new int[ratings.length];
        Arrays.fill(arr,1);

        for(int i=0;i<ratings.length-1;i++)
        {
            if(ratings[i+1]>ratings[i])
            {
                arr[i+1]=1+arr[i];
            } 
        }
        for(int i=ratings.length-1;i>0;i--)
        {
            if(ratings[i-1]>ratings[i])
            {
                arr[i-1]=Math.max(1+arr[i],arr[i-1]);
            } 
        }
        int sum=0;
        for(int i:arr)
        sum+=i;

        return sum;
    }
}