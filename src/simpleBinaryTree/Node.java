/* --------------------------------------------------------
 * -REUSED PROGRAM (Original Author: James Garrett Gruber)-
 * --------------------------------------------------------
 */

package simpleBinaryTree;

public class Node<E extends Comparable<E>> {
	
	    private E element;          // an element stored at this node
	    private Node<E> left;       // a reference to the left child (if any)
	    private Node<E> right;      // a reference to the right child (if any)

	    /**
	     * Constructs a node with the given element and neighbors.
	     *
	     * @param e  the element to be stored
	     * @param leftChild   reference to a left child node
	     * @param rightChild  reference to a right child node
	     */
	    public Node(E e, Node<E> leftChild, Node<E> rightChild) {
	      element = e;
	      left = leftChild;
	      right = rightChild;
	    }

	    // accessor methods
	    public E getElement() { return element; }
	    public Node<E> getLeft() { return left; }
	    public Node<E> getRight() { return right; }

	    // update methods
	    public void setElement(E e) { element = e; }
	    public void setLeft(Node<E> leftChild) { left = leftChild; }
	    public void setRight(Node<E> rightChild) { right = rightChild; }

}
