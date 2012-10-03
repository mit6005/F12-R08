package solutions;

public class AddTreeVisitor<E> implements BinaryTreeVisitor<E,Integer> {

	@Override
	public Integer visit(BinaryTreeLeaf<E> o) {
		String str = o.getValue().toString();
		Integer intValue = Integer.valueOf(str);
		System.out.print(" "+intValue
				+" ");
		return intValue;
	}

	@Override
	public Integer visit(BinaryTreeParent<E> o) {

		System.out.print("(");
		Integer leftVal = o.getLeft().accept(this);

		String value = o.getValue().toString();
		System.out.print(" "+value +" ");
		Integer rightVal = o.getRight().accept(this);
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

}
