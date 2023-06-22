class Solution {
    public long pickGifts(int[] gifts, int k) {
       int len=gifts.length;long sum=0;
            while(k-- >0){
         Arrays.sort(gifts);
         gifts[len-1]=(int)Math.sqrt(gifts[len-1]);
        }
      for(int i=0;i<len;i++)
          sum+=gifts[i];
          return sum;
 
    }
}