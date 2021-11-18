import java.util.ArrayList;
public class LongPath {
    static class Node{
        Node leftnode;
        Node rightnode;
        int nodeData;
    };

    static Node newNode(int nodeData) {
        Node temp = new Node();
        temp.nodeData = nodeData;
        temp.leftnode = null;
        temp.rightnode = null;
        return temp;
        
    }
    
    public static ArrayList<Integer> FindLongestPath(Node root){
       // If root is null means there
           // is no binary tree so
           // return a empty vector
        if(root == null) {
            ArrayList<Integer> output = new ArrayList<>();
            return output;
        }
       // Recursive call on root.rightNode
           ArrayList<Integer> rightNode = FindLongestPath(root.rightnode);
           // Recursive call on root.rightNode
           ArrayList<Integer> leftNode = FindLongestPath(root.leftnode);
           // Compare the size of the two ArrayList
           // and insert current node accordingly
           if(rightNode.size() < leftNode.size()) {
               leftNode.add(root.nodeData);
           }
           else {
               rightNode.add(root.nodeData);
           }
           // Return the appropriate ArrayList
           return (leftNode.size() > rightNode.size() ? leftNode : rightNode);
    }
    public static void main(String[]args) {
        Node root = newNode(100);
        root.leftnode = newNode(20);
        root.rightnode = newNode(130);
        root.leftnode.leftnode = newNode(10);
        root.leftnode.rightnode = newNode(50);
        root.rightnode.leftnode = newNode(110);
        root.leftnode.leftnode.leftnode = newNode(5);
        
        // 100
   //	    /  \
   //	 20    130
   //   /\     /
   //	10 50  110
//  	/
//	   5 
        ArrayList<Integer> output = FindLongestPath(root);
        int size = output.size();
        
        System.out.print(output.get(size - 1));
        for(int i = size - 2; i >= 0; i--) {
            System.out.println(" ->" + output.get(i));
        }
    }
    
}

