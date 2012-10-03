package solutions;

import java.util.List;

/**
 * A binary tree with a left child, right child, and ability to conver to in- or
 * pre-order list representations.
 * @param <E> Type of elements stored.
 */
public interface BinaryTree<E> {
    /**
     * Gets the value at this node.
     * @return The value at this node.
     */
	public E getValue();

    /**
     * Gets the left subtree.  This is an "optional" method, meaning it may
     * throw an {@link UnsupportedOperationException}.
     * @return The right subtree.
     */
    public BinaryTree<E> getLeft();

    /**
     * Gets the right subtree.  This is an "optional" method, meaning it may
     * throw an {@link UnsupportedOperationException}.
     * @return The right subtree.
     */
    public BinaryTree<E> getRight();

    /**
     * Creates and returns an in-order list of the elements in this tree (in order
     * is left child, parent, right child).
     * @return The in-order list of elements.
     */
	public List<E> getInOrder();

	/**
	 * Creates and returns a pre-order list of the elements in this tree.
	 * @return The pre-order list of elements.
	 */
	public List<E> getPreOrder();

	
	/**
	 * visit method 
	 * @return returns an object
	 */
	public <R>R accept(BinaryTreeVisitor<E,R> visitor);

}
