/**
 * The Node class is our building block which will be used to create our Binary
 * Search Tree.
 * Note that a Node contains other nodes. Thus, it has a recursive nature.
 * 
 * The key value dictates where a Node will reside in the BST
 * - Nodes with strictly smaller key values will be found in our left subtree.
 * - Nodes with strictly larger key values will be found in our right subtree.
 * 
 * Additionally, each Node can hold some internal data.
 */
public class Node implements NodeFunctions {
	private final int key; // dictates where the Node will be placed within a BST.
	
	private Node parent; // points to the Node that is our parent, one depth above us, closer to the root
						 // of the entire BST.
	private Node left; // points to the Node that is our left child, the relative root of our left
						// subtree.
	private Node right; // points to the Node that is our right child, the relative root of our right
						// subtree.
	private Object data; // points to some internal data held within this Node.

	/**
	 * Value constructor which creates a Node holding some internal data.
	 * Note that this Node's parent node and children nodes are all initialized to
	 * null.
	 * 
	 * @param int    key - specifies the key value held by this Node.
	 * @param Object data - specifies the internal data held by this Node.
	 */
	public Node(int key, Object data) {
		this.key = key;
		this.parent = null;
		this.left = null;
		this.right = null;
		this.data = data;
	}

	/**
	 * Value constructor which creates a Node holding no internal data (ie data
	 * which is defaulted to null).
	 * Note that this Node's parent node and children nodes are all initialized to
	 * null.
	 * 
	 * @param int key - specifies the key value held by this Node
	 */
	public Node(int key) {
		this(key, null);
	}

	/**
	 * Returns the key value stored within the current node.
	 * 
	 * @return the internally held key value
	 */
	public int getKey() {
		return this.key;
	}

	/**
	 * Returns the Node which is the parent of the current Node.
	 * 
	 * @return the internally held parent Node
	 */
	public Node getParent() {
		return this.parent;
	}

	/**
	 * Returns the Node which is the left child of the current Node.
	 * 
	 * @return the internally held left child Node
	 */
	public Node getLeft() {
		return this.left;
	}

	/**
	 * Returns the Node which is the right child of the current Node.
	 * 
	 * @return the internally held right child Node
	 */
	public Node getRight() {
		return this.right;
	}

	/**
	 * Sets the left child Node of the current Node.
	 * 
	 * @param Node n - specifies which node will be stored as the left child.
	 */
	public void setLeft(Node n) {
		this.left = n;
	}

	/**
	 * Sets the right child Node of the current Node.
	 * 
	 * @param Node n - specifies which node will be stored as the right child.
	 */
	public void setRight(Node n) {
		this.right = n;
	}

	/**
	 * Sets the parent Node of the current Node.
	 * 
	 * @param Node n - specifies which node will be stored as the parent.
	 */
	public void setParent(Node n) {
		this.parent = n;
	}

	/**
	 * Returns a string representation of the current Node's state, of the form
	 * "(x,y,z,w)", where:
	 * 
	 * - x is the current Node's key value.
	 * - y is the parent Node's key value.
	 * - z is the left child Node's key value.
	 * - w is the right child Node's key value.
	 * 
	 * If any of the Nodes are null, then its key value should be represented via an
	 * empty String
	 * 
	 * Example: "(10,,3,14)"
	 * - represents Node with key value 10
	 * - whose parent Node is null
	 * - whose left child Node has key value 3
	 * - whose right child Node has key value 14
	 * 
	 * @return String representation of the current Node
	 */
	@Override
	public String toString() {
		String ret = "(" + this.key + ",";
		
		if (this.parent != null) {
			ret += parent.key;
		}
		ret += ",";
		if (this.left != null) {
			ret += left.key;
		}
		ret += ",";
		if (this.right != null) {
			ret += right.key;
		}
		ret += ")";
		return ret;
	}

	/**
	 * Returns whether the current Node is equal to another object.
	 * A Node is considered equal to another Node if they have the same key value.
	 * 
	 * @param Object o - the other object being compared to the current Node for
	 *               equality.
	 *
	 * @return true for equality, false otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (this == o) {
			return true;
		} else if (this.getClass() == o.getClass()) {
			return (this.key == ((Node) o).getKey());
		} else {
			return false;
		}
	}

	/**
	 * Getter for the internal data held within the current Node.
	 * 
	 * @return the internally held data
	 */
	public Object getData() {
		return this.data;
	}

	/**
	 * Sets the internal data held within the current Node.
	 * 
	 * @param Object o - specifies the internal data to be stored in the current
	 *               Node
	 */
	public void setData(Object o) {
		this.data = o;
	}
}
