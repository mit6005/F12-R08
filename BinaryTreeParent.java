package solutions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * A parent tree contains other subtrees as well as a value.
 * @param <E> The type we store.
 */
public class BinaryTreeParent<E> implements BinaryTree<E> {
    /** The value stored here. */
	private final E value;

	/** The right child of this parent. */
	private final BinaryTree<E> right;

	/** The left child of this parent. */
	private final BinaryTree<E> left;

    /**
     * Creates a new binary parent tree.
     * @param value Value at this node.
     * @param right Right sub-tree.
     * @param left Left sub-tree.
     */
    public BinaryTreeParent(E value, BinaryTree<E> right, BinaryTree<E> left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

   

	@Override
	/** @see BinaryTree#getValue() */
    public E getValue() {
        return value;
    }

	@Override
	/** @see BinaryTree#getLeft() */
	public BinaryTree<E> getLeft() {
		return left;
	}

	@Override
	/** @see BinaryTree#getRight() */
	public BinaryTree<E> getRight() {
		return right;
	}

    @Override
	/** @see BinaryTree#getInOrder() */
	public List<E> getInOrder() {
		List<E> inOrder = left.getInOrder();
		inOrder.add(value);
		inOrder.addAll(right.getInOrder());

		return inOrder;
		
	}

	@Override
	/** @see BinaryTree#getPreOrder() */
	public List<E> getPreOrder() {
		List<E> preOrder = new ArrayList<E>();
		preOrder.add(value);
		preOrder.addAll(left.getPreOrder());
		preOrder.addAll(right.getPreOrder());

		return preOrder;
	}

	@Override
	public String toString() {
		String left = this.getLeft().toString();
		String right = this.getRight().toString();
		String value = this.getValue().toString();
		return "( "+left +" "+value + " "+right+" )";
	}

	@Override
	public <R>R accept(BinaryTreeVisitor<E,R> visitor) {
		return visitor.visit(this);
	}
	
	
	
}
