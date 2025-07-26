package day16;

class Tree{
	int data;
	Tree left;
	Tree right;
	Tree(int d){
		data = d;
		left = null;
		right = null;
	}
}

class TreeMethod{
	Tree root = null;
	void preorder(Tree n) {
		if(n!=null) {
			
			System.out.print(n.data);
			preorder(n.left);
			preorder(n.right);
		}
	}
}

public class BinaryTree {
	public static void main(String[] args) {
		TreeMethod t = new TreeMethod();
		t.root = new Tree(1);
		t.root.left = new Tree(2);
		t.root.right = new Tree(3);
		t.root.left.left = new Tree(4);
		t.root.right.right = new Tree(5);
		t.preorder(t.root);
		System.out.println();
	}

}
