/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
   
    public void t(Node root,ArrayList<Integer> list)
    {
    if(root==null) return;
    list.add(root.data);
    t(root.left,list);
    t(root.right,list);
     }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
         ArrayList<Integer> list = new ArrayList<>();
        t(root,list);
        return list;
    }
}