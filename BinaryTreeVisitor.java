package solutions;

public interface BinaryTreeVisitor<E,R> {
	public R visit(BinaryTreeLeaf<E> o);
	public R visit(BinaryTreeParent<E> o);
}

