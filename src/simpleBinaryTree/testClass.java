/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * August 1, 2019
 *
 * PROBLEM:
 * A "unival" tree (which stands for "universal value") is a
 * tree where all nodes under it have the same value. Given 
 * the root to a binary tree, count the number of unival subtrees.
 * 
 * For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 
 * NOTE: Of the three java classes in this package, this one is
 * the only one being edited at this time. The other two were 
 * made by my several years ago for my Data Structures class.
 * ---------------------------------------------------------
 */

package simpleBinaryTree;

import java.util.ArrayList;

public class testClass {
	public static void main(String[] args)
	{
		// Creating the example binary tree in a very inefficient way
		simpleLinkedBinaryTree<Integer> myBtree = new simpleLinkedBinaryTree<Integer>();
		myBtree.addRoot(0);
		Node<Integer> A=myBtree.addLeft(myBtree.root(), 1);
		Node<Integer> B=myBtree.addRight(myBtree.root(), 0);
		Node<Integer> C=myBtree.addLeft(B, 1);
		Node<Integer> D=myBtree.addRight(B, 0);
		Node<Integer> E=myBtree.addLeft(C, 1);
		Node<Integer> F=myBtree.addRight(C, 1);
		
		// Printing the top view
		System.out.println("Top View:");
		ArrayList<Node<Integer>> inOrderList = myBtree.inorder();
		for(Node<Integer> p: inOrderList)
			System.out.print(p.getElement()+"  ");
		System.out.println();
		System.out.println();	
		
		// Printing the tree view in a very inflexable way that only works for this tree.
		System.out.println("Tree View:");
		System.out.println("   " + myBtree.root().getElement());
		System.out.println("  / \\");
		System.out.println(" " + A.getElement() + "   " + B.getElement());
		System.out.println("    / \\");
		System.out.println("   " + C.getElement() + "   " + D.getElement());
		System.out.println("  / \\");
		System.out.println(" " + E.getElement() + "   " + F.getElement());
	}

}
