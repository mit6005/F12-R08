package solutions;

public class PrintTreeVisitor<E> implements BinaryTreeVisitor<E,Void> {

	@Override
	public Void visit(BinaryTreeLeaf<E> o) {
		String str = o.getValue().toString();
		Integer intValue = Integer.valueOf(str);
		System.out.print(" " + intValue + " ");
		return null;
	}

	@Override
	public Void visit(BinaryTreeParent<E> o) {

		System.out.print("(");
		o.getLeft().accept(this);
		String value = o.getValue().toString();
		System.out.print(" " + value + " ");
		o.getRight().accept(this);
		System.out.print(")");

		Integer retVal = 0;
		return null;
	}

	

}