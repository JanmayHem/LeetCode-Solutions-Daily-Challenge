/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
Memory Usage: 41.2 MB, less than 15.12% of Java online submissions for Guess Number Higher or Lower.
*/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1,high=n,mid=n;
        while(guess(mid)!=0){
            mid=low+(high-low)/2;
            if(guess(mid)==1){
                low=mid+1;
          }
          else{
              high=mid-1;
          }
      }
      return mid;  
    }
}
