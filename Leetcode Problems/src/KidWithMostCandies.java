class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            boolean test = false;
            for(int j = 0; j < n; j++) {
                if(candies[i] + extraCandies < candies[j]){
                    test = true;
                    break;
                }
            }
            if (test) {
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;
    }
}
