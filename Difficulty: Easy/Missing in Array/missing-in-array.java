class Solution {
    int missingNum(int arr[]) {
        // code here
        int ans=0;
         for(int i=1;i<=arr.length+1;i++){
            ans^=i;
        }
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
       
        return ans;
    }
}