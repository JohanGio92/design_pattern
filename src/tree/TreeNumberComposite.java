package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TreeNumberComposite implements TreeNumber {
	
	private final String name;
	private List<TreeNumber> treeNumberlist;

	public TreeNumberComposite(String name) {
		this.name = name;
		this.treeNumberlist = new ArrayList<>();
	}

	@Override
	public void add(TreeNumber treeNumber) {
		this.treeNumberlist.add(treeNumber);
	}

	@Override
	public void remove(TreeNumber treeNumber) {
		this.treeNumberlist.remove(treeNumber);
	}

	@Override
	public int number() {
		return this.treeNumberlist.size();
	}

	@Override
	public int sum() {
		return this.treeNumberlist.stream()
                .mapToInt(TreeNumber::sum)
                .sum();
	}

	@Override
	public int higher() {
		return this.treeNumberlist.stream()
                .mapToInt(TreeNumber::higher)
                .max()
                .orElseThrow(NoSuchElementException::new);
	}

	@Override
    public String toString() {
        return "[" + this.name + "]";
    }
}
