class Solution {
    int single(int[] arr) {
        // code here
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
}