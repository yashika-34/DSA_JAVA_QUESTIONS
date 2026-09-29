class Solution {

    public int numberOfSets(int n, int k) {

        long MOD = 1_000_000_007L;

        long[][] dp = new long[n][k + 1];
        long[][] prefix = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
            prefix[i][0] = i + 1;
        }

        for (int seg = 1; seg <= k; seg++) {

            for (int point = 1; point < n; point++) {

                dp[point][seg] = dp[point - 1][seg];

                dp[point][seg] =
                    (dp[point][seg] +
                     prefix[point - 1][seg - 1]) % MOD;

                prefix[point][seg] =
                    (prefix[point - 1][seg] +
                     dp[point][seg]) % MOD;
            }
        }

        return (int) dp[n - 1][k];
    }
}