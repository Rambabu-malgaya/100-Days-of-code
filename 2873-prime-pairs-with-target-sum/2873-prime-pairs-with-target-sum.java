class Solution {
    public static List<List<Integer>> findPrimePairs(int n) {
        // sieve of Eratosthenes
        boolean[] vis = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!vis[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    vis[j] = true;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 2; i <= n / 2; i++) {
            int x = i;
            int y = n - i;

            if (!vis[x] && !vis[y] && x <= y) {
                List<Integer> pair = new ArrayList<>();
                pair.add(x);
                pair.add(y);
                ans.add(pair);
            }
        }

        return ans;
    }
}