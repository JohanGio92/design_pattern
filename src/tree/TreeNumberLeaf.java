package tree;

public class TreeNumberLeaf implements TreeNumber {

	private final int valor;

	public TreeNumberLeaf(int valor) {
		this.valor = valor;
	}

	@Override
	public void add(TreeNumber treeNumber) {
		throw new UnsupportedOperationException("\"Unsupported operation in leaf\"");
	}

	@Override
	public void remove(TreeNumber treeNumber) {
		//nothing
	}

	@Override
	public int number() {
		return this.valor;
	}

	@Override
	public int sum() {
		return this.valor;
	}

	@Override
	public int higher() {
		return 1;
	}

}
