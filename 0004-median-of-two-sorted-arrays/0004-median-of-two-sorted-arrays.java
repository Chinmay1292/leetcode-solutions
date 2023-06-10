class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c1 = a+b;
        int[] c = new int[c1];
        System.arraycopy(nums1,0,c,0,a);
        System.arraycopy(nums2,0,c,a,b);
        Arrays.sort(c);
        int mid = c1/2;
        double ans = 0;
        if(c1%2==0){
            ans=(float)(c[mid]+c[mid-1])/2;
        }
        else{
            ans = c[mid];
        }
        return ans;
    }
}