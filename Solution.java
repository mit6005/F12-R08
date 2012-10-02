package solutions;

public class Solution {

	public static void main(String[] args) {
		BinaryTree<String> bt = new BinaryTreeLeaf<String>("32");
		BinaryTree<String> btp = new BinaryTreeParent<String>("+", bt, bt);
		
		BinaryTreeVisitor<String> addVisitor = new AddTreeVisitor();
		BinaryTreeVisitor<String> printVisitor = new PrintTreeVisitor();
		
		Integer val = (Integer) bt.accept(addVisitor);
		System.out.println("value 1 is this "+val);

		Integer val2 = (Integer) btp.accept(addVisitor);
		System.out.println("value 2 is this "+val2);

		Integer val3 = (Integer) bt.accept(printVisitor);
		System.out.println("value 3 is this "+val3);

		Integer val4 = (Integer) btp.accept(printVisitor);
		System.out.println("value 4 is this "+val4);

	}
}
