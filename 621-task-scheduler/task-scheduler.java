class Solution {
    public int leastInterval(char[] tasks, int n) {
        int fre[]=new int[26];
        for(char c:tasks)
        fre[c-'A']++;

        Arrays.sort(fre);
        int chunk=fre[25]-1;
        int ideal=chunk*n;

        for(int i=24;i>=0;i--)
        ideal-=Math.min(chunk,fre[i]);

        return ideal<0 ? tasks.length:ideal+tasks.length;
    }
}