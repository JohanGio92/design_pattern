package treeBad;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TreeNumber {
	
	private Integer number;
	private String name;
	private List<TreeNumber> treeNumberList;

	public TreeNumber(String name) {
		this.name = name;
		this.treeNumberList = new ArrayList<>();
	}
	
	public TreeNumber(Integer number) {
		this.number = number;
		this.treeNumberList = null;
	}
	
	public boolean isComposite() {
		return this.treeNumberList != null;
	}
	
	public void add(TreeNumber treeNumber) {
		if(this.isComposite()) {
			treeNumberList.add(treeNumber);
		} else {
			throw new UnsupportedOperationException("Unsupported operation in leaf");
		}
	}
	
	public void remove(TreeNumber treeNumber) {
		if(this.isComposite()) {
			treeNumberList.remove(treeNumber);
		}
	}

	public int numberOfNodes() {
		int result = 1;
		if(this.isComposite()) {
			result = this.treeNumberList.size();
		}
		return result;
	}
	
	public int sum() {
		int result = this.number;
		if(this.isComposite()) {
			result = this.treeNumberList.stream()
					.mapToInt(TreeNumber::sum)
					.sum();
		}
		return result;
	}
	
	public int higher() {
		if (this.isComposite()) {
			return this.treeNumberList.stream()
					.mapToInt(TreeNumber::higher)
					.max()
					.orElseThrow(NoSuchElementException::new);
		} else {
			return this.number;
		}
	}

	@Override
	public String toString() {
		return "TreeNumbers{" +
				"number=" + number +
				", name='" + name + '\'' +
				", treeNumbersList=" + treeNumberList +
				'}';
	}

}
