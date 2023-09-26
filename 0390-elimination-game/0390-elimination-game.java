class Solution {
    public int lastRemaining(int n) {
        boolean l = true;
        int head = 1;
        int step = 1;

        int r = n;
        while(r>1){
            if(l||r%2==1){
                head += step;
            }
            step *= 2;
            r /= 2;
            l = !l;
        } 
        return head;
    }
}