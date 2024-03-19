class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0)
        {
            return target-1;
        }
        int con=0;
        while(target>1 && maxDoubles>0){
            if(target%2==0)
            {
                target/=2;
                maxDoubles--;
            }
            else
            {
                target--;
            }
            con++;
        }
        return con+target-1;
    }
}