/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void t(Node root,ArrayList<Integer> list){
        if(root==null) return;
        t(root.left,list);
        list.add(root.data);
        t(root.right,list);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        t(root,list);
        return list;
    }
}