//Basic Program to Implement the Binary Search Tree with In_Order, Pre_Orderand Post_Order Traversal
public class BST
{
    //Declration of Class Node (Structure for Node)
    class Node
    {
        int key; 
        Node left, right; 
        
        //Node Parameterized Constructor for assigning the data 
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    }
    Node root; 

    public void BST()
    {
        root = null;
    }

    //Insert method for insertion of node->Data into Tree
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 

    Node insert_Recursive(Node root, int key) { 
        //tree is empty
      if (root == null) { 
          root = new Node(key); 
          return root; 
      } 
      //traverse the tree
      if (key < root.key)     //insert in the left subtree
          root.left = insert_Recursive(root.left, key); 
      else if (key > root.key)    //insert in the right subtree
          root.right = insert_Recursive(root.right, key); 
        // return pointer
      return root; 
    }
    
    //In_Order Traversal left->root->right
    void In_Order() { 
        InOrder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void InOrder_Recursive(Node root) { 
        if (root != null) { 
            InOrder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            InOrder_Recursive(root.right); 
        } 
    }
    
    //Pre_Order Traversal root->left->right
    void Pre_Order() { 
        PreOrder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void PreOrder_Recursive(Node root) { 
        if (root != null) { 
            System.out.print(root.key + " "); 
            PreOrder_Recursive(root.left); 
            PreOrder_Recursive(root.right); 
        } 
    } 

    //Pre_Order Traversal left->right->root
    void Post_Order() { 
        PostOrder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void PostOrder_Recursive(Node root) { 
        if (root != null) { 
            PostOrder_Recursive(root.left); 
            PostOrder_Recursive(root.right); 
            System.out.print(root.key + " "); 
        } 
    } 

    public static void main(String[] args)
    {
        //Declared a static array, / Data can be accepted dynamically from user using an ArrayList<int> DS.
        int[] A = {467,479,521,2,523,541,151,157,163,167,173,5,7,11,13,17,487,491,1361,1367,499,503,509,19,23,29};
        BST bst = new BST();
        
        for(int i=0;i<A.length;i++)
        {
            bst.insert(A[i]);
        }
        System.out.println("\n");

        System.out.println("The BST Created with In_Order Traversal (Left-Root-Right)");
        bst.In_Order(); 
        System.out.println("\n");
        
        System.out.println("The BST Created with Pre_Order Traversal (Root-Left-Right)");
        bst.Pre_Order(); 
        System.out.println("\n");
        
        System.out.println("The BST Created with Post_Order Traversal (Left-Right-Root)");
        bst.Post_Order(); 
        System.out.println("\n");
    }
}