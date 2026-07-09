class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int ans=0;
         for(int i=1;i<=arr.length;i++){
            ans^=i;
        }
        for(int num:arr){
            ans^=num;
        }
       
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int repeat=0;
        for(int i : arr){
            if(set.contains(i)){
                repeat=i;
            }
            else{
            set.add(i);
        }
        }
        ans=ans^repeat;
       list.add(repeat);
        list.add(ans);
        
        return list;
    }
}
