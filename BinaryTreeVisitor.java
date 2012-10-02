package solutions;

public interface BinaryTreeVisitor<E> {
	public Object visit(BinaryTreeLeaf<E> o);
	public Object visit(BinaryTreeParent<E> o);
	public Object visit(BinaryTree<E> o);
}

