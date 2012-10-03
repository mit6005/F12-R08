package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * A leaf node, that stores only one value and has no children.
 * 
 * @param <E>
 *            The type we're storing.
 */
public class BinaryTreeLeaf<E> implements BinaryTree<E> {
	/** The element we're storing here. */
	private final E value;

	/**
	 * Creates a new {@link BinaryTreeLeaf}.
	 * 
	 * @param value
	 *            The value.
	 */
	public BinaryTreeLeaf(E value) {
		this.value = value;
	}

	@Override
	/** @see BinaryTree#getValue() */
	public E getValue() {
		return value;
	}

	@Override
	/**
	 * Not a supported operation for this type of BinaryTree.
	 * @see BinaryTree#getLeft()
	 * @throws UnsupportedOperationException Always.
	 */
	public BinaryTree<E> getLeft() {
		throw new UnsupportedOperationException();
	}

	@Override
	/**
	 * Not a supported operation for this type of BinaryTree.
	 * @see BinaryTree#getRight()
	 * @throws UnsupportedOperationException Always.
	 */
	public BinaryTree<E> getRight() {
		throw new UnsupportedOperationException();
	}

	@Override
	/** @see BinaryTree#getInOrder() */
	public List<E> getInOrder() {
		List<E> inOrder = new ArrayList<E>();
		inOrder.add(value);
		return inOrder;
	}

	@Override
	/** @see BinaryTree#getPreOrder() */
	public List<E> getPreOrder() {
		List<E> preOrder = new ArrayList<E>();
		preOrder.add(value);
		return preOrder;
	}


	@Override
	public <R>R accept(BinaryTreeVisitor<E,R> visitor) {
		return visitor.visit(this);
	}

}
