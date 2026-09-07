class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            if (losses[winner] == 0) {
                losses[winner] = -1;
            }
            if (losses[loser] == -1) {
                losses[loser] = 1;
            } 
            else {
                losses[loser]++;
            }
        }
        List<Integer> zeroLosses = new ArrayList<>();
        List<Integer> oneLosses = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            if (losses[i] == -1) {
                zeroLosses.add(i);
            }
            if (losses[i] == 1) {
                oneLosses.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zeroLosses);
        ans.add(oneLosses);
        return ans;
    }
}