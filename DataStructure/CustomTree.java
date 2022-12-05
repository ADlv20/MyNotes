package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class CustomTree {

    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public class BinaryTree{
        int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if (nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public void preorder(Node root){
        /** Root Left Right
         * Time Complexity : BigO(n)
         */

        if (root == null){
            System.out.println(-1);
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        /** Left Root Right
         * Time Complexity : BigO(n)
         */

        if (root == null){
            System.out.println(-1);
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    // Very Important
    public void levelOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else
                    q.add(null);
            }
            else {
                System.out.print(currNode.data+ " ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1,-1};
        CustomTree cs = new CustomTree();
        CustomTree.BinaryTree  cbt = cs.new BinaryTree();

        Node root = cbt.buildTree(nodes);
        cs.levelOrderTraversal(root);
    }
}
