class Solution {
public:
    int ncr(int n,int r){
        long double ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        
        return int(ans);
    }
    int uniquePaths(int m, int n){
        int total=((m+n-2));
        return ncr(total,m-1);
    }
};