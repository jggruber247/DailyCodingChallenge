/* --------------------------------------------------------
 * -REUSED PROGRAM (Original Author: James Garrett Gruber)-
 * --------------------------------------------------------
 */

package simpleBinaryTree;

import java.util.ArrayList;

public class simpleLinkedBinaryTree<E extends Comparable<E>> {
	 protected Node<E> root = null;     // root of the tree
	 public simpleLinkedBinaryTree() { }//constructor_Construts an empty binary tree.
	 
	 // Returns the root of the tree (or null if tree is empty).
	 public Node<E> root() {
		    return root;
	 }
	 
	 public boolean isEmpty() { return root == null; }
	 
	 public int numChildren(Node<E> p) {
		    int count=0;
		    if(p.getLeft()!=null) count++;
		    if(p.getRight()!=null) count++;
		    return count;
	}
	 
	public ArrayList<Node<E>> children(Node<E> p) {
		    ArrayList<Node<E>> snapshot = new ArrayList<>(2);    // max capacity of 2
		    if (left(p) != null)
		      snapshot.add(left(p));
		    if (right(p) != null)
		      snapshot.add(right(p));
		    return snapshot;
	}
	 
	 public boolean isInternal(Node<E> p) { return numChildren(p) > 0; }
	 public boolean isExternal(Node<E> p) { return numChildren(p) == 0; }
	 
	 public Node<E> left(Node<E> p) throws IllegalArgumentException {
		    return p.getLeft();
	 }
	 
	 public Node<E> right(Node<E> p) throws IllegalArgumentException {
		    return p.getRight();
	 }

		 
		  /**
		   * Places element e at the root of an empty tree and returns its new Position.
		   *
		   * @param e   the new element
		   * @return the Position of the new element
		   * @throws IllegalStateException if the tree is not empty
		   */
	  public Node<E> addRoot(E e) throws IllegalStateException {
	    if (!isEmpty()) throw new IllegalStateException("Tree is not empty");
	    root = new Node<E>(e, null, null);
	    return root;
	  }

	  /**
	   * Creates a new left child of Position p storing element e and returns its Position.
	   */
	  public Node<E> addLeft(Node<E> p, E e)
	                          throws IllegalArgumentException {
		  if (p.getLeft() != null)
	      throw new IllegalArgumentException("p already has a left child");
	    Node<E> child = new Node<E>(e, null, null);
	    p.setLeft(child);
	    return child;
	  }

	  /**
	   * Creates a new right child of Position p storing element e and returns its Position.
	   */
	  public Node<E> addRight(Node<E> p, E e)
	                          throws IllegalArgumentException {
	    if (p.getRight() != null)
	      throw new IllegalArgumentException("p already has a right child");
	    Node<E> child = new Node<E>(e,null, null);
	    p.setRight(child);
	    return child;
	  }

		  /**
		   * Replaces the element at Position p with element e and returns the replaced element.
		   */
		  public E set(Node<E> p, E e) throws IllegalArgumentException {
		    E temp = p.getElement();
		    p.setElement(e);
		    return temp;
		  }

		
		  public void attach(Node<E> p, simpleLinkedBinaryTree<E> t1,
				  simpleLinkedBinaryTree<E> t2) throws IllegalArgumentException {
		    if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf");
		    if (!t1.isEmpty()) {                  // attach t1 as left subtree of node
		      p.setLeft(t1.root);
		      t1.root = null;
		    }
		    if (!t2.isEmpty()) {                  // attach t2 as right subtree of node
		      p.setRight(t2.root);
		      t2.root = null;
		    }
		  }

		
		  public E remove(Node<E> p) throws IllegalArgumentException {
		    if (numChildren(p) == 2)
		      throw new IllegalArgumentException("p has two children");
		    Node<E> child = (p.getLeft() != null ? p.getLeft() : p.getRight() );
		    if (p == root)
		      root = child;                       // child becomes root
		    else {
		      Node<E> parent = (Node<E>) parent(p,root);
		      if (p == parent.getLeft())
		        parent.setLeft(child);
		      else
		        parent.setRight(child);
		    }
		    E temp = p.getElement();
		    p.setElement(null);                // help garbage collection
		    p.setLeft(null);
		    p.setRight(null);
		    return temp;
		  }  
		  
		  //preorder traversal
		  private void preorderSubtree(Node<E> p, ArrayList<Node<E>> snapshot) {
			    snapshot.add(p);                       // for preorder, we add position p before exploring subtrees
			    for (Node<E> c : children(p))
			    preorderSubtree(c, snapshot);
			  }

		  public ArrayList<Node<E>> preorder() {
			  ArrayList<Node<E>> snapshot = new ArrayList<>();
		    if (!isEmpty())
		      preorderSubtree(root(), snapshot);   // fill the snapshot recursively
		    return snapshot;
		  }
		  
		  //in_order traversal
		  private void inorderSubtree(Node<E> p, ArrayList<Node<E>> snapshot) {
			    if (left(p) != null)
			      inorderSubtree(left(p), snapshot);
			    snapshot.add(p);
			    if (right(p) != null)
			      inorderSubtree(right(p), snapshot);
			  }

		  public ArrayList<Node<E>> inorder() {
			 ArrayList<Node<E>> snapshot = new ArrayList<Node<E>>();
		    if (!isEmpty())
		      inorderSubtree(root(), snapshot);   // fill the snapshot recursively
		    return snapshot;
		  }
		  
		//post_order traversal
		  private void postorderSubtree(Node<E> p, ArrayList<Node<E>> snapshot) {
			    for (Node<E> c : children(p))
			      postorderSubtree(c, snapshot);
			    snapshot.add(p);                       // for postorder, we add position p after exploring subtrees
			  }

		  public ArrayList<Node<E>> postorder() {
			  ArrayList<Node<E>> snapshot = new ArrayList<Node<E>>();
		    if (!isEmpty())
		      postorderSubtree(root(), snapshot);   // fill the snapshot recursively
		    return snapshot;
		  }
		  
		  //Returns the number of nodes in the tree.
		  public int size(Node<E> node) {	    
			  int size = 0;
			  if(node == null) {
				  return size;
			  }
			  else {
				  return (size(node.getLeft()) + 1 + size(node.getRight()));
			  }
		  }
		  
		  //Returns the Node of p's parent (or null if p is root).
		  public Node<E> parent(Node<E> p1, Node<E> p2){

			  if (p2 == root || p1 == null) {
				  return null;
			  }
			  else {
				  if (p1.getLeft() == p2 || p1.getRight() == p2) {
					  return p1;
				  }
				  else {
					  if ((int)(p1.getElement())<(int)(p2.getElement())) {
						  return parent(p1.getRight(),p2);
					  }
					  else {
						  return parent(p1.getLeft(),p2);
					  }
				  }
			  }
		  }
		  
		  public boolean isIdentical(Node<E> p1, Node<E> p2){
			  if (p1.getElement() == p2.getElement()) {
				  if (p1.getLeft()==p2.getLeft() || p1.getRight()==p2.getRight()) {
					  return true;
				  }
				  else {
					  return false;
				  }
			  }
			  else {
				  return false;
			  }
						  
		  }
		  
		 public boolean ancestors(Node<E> p1, Node<E> p2, ArrayList<Node<E>> List)
		 {
			 if (p1 == null)
				 return false;
			 else if (p2 == root) {
				 List.add(p2);
				 return true;
			 }
			 else {
				 boolean left = ancestors(p1.getLeft(), p2, List);
				 if (left==false) {
					 boolean right = ancestors(p1.getRight(), p2, List);
					 if (left || right) {
						 List.add(p1);
						 return left || right;
					 }
					 else {
						 return false;
					 }
				 }
				 else {
					 return false;
				 }
			 
			 }
		 }
		  
}
