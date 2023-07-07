class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey, k, 'T'), helper(answerKey, k, 'F'));
    }

    public int helper(String key, int k, char ch){
        int sp=0;
        int ep=0;
        int ans=0;
        while(ep<key.length()){
            if(key.charAt(ep)!=ch){
                k--;
            }
            while(k<0){
                if(key.charAt(sp)==ch){
                    sp++;
                }
                else{
                    k++;
                    sp++;
                }
            }
            ans=Math.max(ans, ep-sp+1);
            ep++;
        }
        return ans;
    }
}