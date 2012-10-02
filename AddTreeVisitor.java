package solutions;

public class AddTreeVisitor<E> implements BinaryTreeVisitor<E> {

	@Override
	public Object visit(BinaryTreeLeaf<E> o) {
		String str = o.getValue().toString();
		Integer intValue = Integer.valueOf(str);
		System.out.print(" "+intValue
				+" ");
		return intValue;
	}

	@Override
	public Object visit(BinaryTreeParent<E> o) {

		System.out.print("(");
		Integer leftVal = (Integer) this.visit(o.getLeft());

		String value = o.getValue().toString();
		System.out.print(" "+value +" ");
		Integer rightVal = (Integer) this.visit(o.getRight());
		System.out.print(")");
		Integer retVal =0;
		if(value.trim().equals("+"))
		{
			retVal = leftVal + rightVal;
		}
		else if (value.trim().equals("-"))
		{
			retVal = leftVal - rightVal;
		}
		return retVal;
	}

	@Override
	public Object visit(BinaryTree<E> o) {
		String value = o.getValue().toString();
		//depending on a trait of tokens, decide which one is it. 
		if(value.trim().equals("+")||value.trim().equals("-"))
			return this.visit((BinaryTreeParent<E>) o);
		else 
			return this.visit((BinaryTreeLeaf<E>) o);
	}

}
