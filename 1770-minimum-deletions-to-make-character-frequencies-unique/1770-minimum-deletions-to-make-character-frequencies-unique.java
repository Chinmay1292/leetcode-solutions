class Solution {
    public int minDeletions(String s) {
        int c=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            hm.put(ch[i], hm.getOrDefault(ch[i], 0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for(char c1 : hm.keySet()){
            int freq = hm.get(c1);
            if(!set.contains(freq))set.add(freq);
            else{
                while(freq>0 && set.contains(freq)){
                    freq--;
                    c++;
                }
                if(freq>0)set.add(freq);
            }
        }
        return c;
    }
}