class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int num=0;
        int power=1; //for every next iteration it doubles 
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                num+=power;
            }
            power=power*2;
        }
        return num;
    }
}