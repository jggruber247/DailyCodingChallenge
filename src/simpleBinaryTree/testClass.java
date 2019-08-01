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

//import java.util.ArrayList;

public class testClass {
	public static void main(String[] args)
	{
		simpleLinkedBinaryTree<Integer> myBtree = new simpleLinkedBinaryTree<Integer>();
		myBtree.addRoot(5);
		Node<Integer> left=myBtree.addLeft(myBtree.root(), 2);
		myBtree.addLeft(left, 8);
		myBtree.addRight(left, 10);
		
		
		
		
		/*
		ArrayList<Node<Integer>> preorderList = myBtree.preorder();
		for(Node<Integer> p: preorderList)
		System.out.print(p.getElement()+"\t");
		System.out.println();
		System.out.println("Number of Node on the tree:\t"+myBtree.size(myBtree.root));
		simpleLinkedBinaryTree<Integer> oBtree = myBtree;
		System.out.println("Those two trees are identical:\t"+myBtree.isIdentical(myBtree.root, oBtree.root));
		System.out.println("The parent node of "+ left.getElement() +"\t is" + myBtree.parent(myBtree.root, left));
		ArrayList<Integer> ancestorlist = myBtree.ancestors(myBtree.root,left.getLeft(),ancestorlist);
		for(Integer i: ancestorlist) System.out.print(i+"\t");
		*/
		
	}

}
