package solutions;

public class PrintTreeVisitor<E> implements BinaryTreeVisitor<E> {

	@Override
	public Object visit(BinaryTreeLeaf<E> o) {
		String str = o.getValue().toString();
		Integer intValue = Integer.valueOf(str);
		System.out.print(" " + intValue + " ");
		return null;
	}

	@Override
	public Object visit(BinaryTreeParent<E> o) {

		System.out.print("(");
		this.visit(o.getLeft());
		String value = o.getValue().toString();
		System.out.print(" " + value + " ");
		this.visit(o.getRight());
		System.out.print(")");

		Integer retVal = 0;
		return null;
	}

	@Override
	public Object visit(BinaryTree<E> o) {
		String value = o.getValue().toString();
		if (value.trim().equals("+") || value.trim().equals("-"))
			this.visit((BinaryTreeParent<E>) o);
		else
			this.visit((BinaryTreeLeaf<E>) o);
		return null;
	}

}