/*
Runtime: 2 ms, faster than 98.34% of Java online submissions for Perfect Squares.
Memory Usage: 40.9 MB, less than 98.68% of Java online submissions for Perfect Squares.
*/

class Solution {
    public int numSquares(int n) {
        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n)
            return 1;

        while (n % 4 == 0)
            n = n / 4;

        if (n % 8 == 7)
            return 4;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int base = (int) Math.sqrt(n - square);
            if (base * base == n - square)
                    return 2;
        }
        return 3;
    } 
}

/*
Solution using DP
*/

class Solution {
    public int numSquares(int n) {
	    int[] dp = new int[n+1];
	    dp[0] = 0;
	    for (int i=1; i<=n; i++) {
		    dp[i] = i;
		    for (int j=1; j*j<=i; j++) {
			    int square = j*j;
			    dp[i] = Math.min(dp[i], 1+dp[i-square]);
		    }
	    }
	    return dp[n];
    }   
}
