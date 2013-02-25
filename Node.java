import java.util.ArrayList;


public class Node {
	 String value;
	 ArrayList<Node> nexts = new ArrayList<Node>();
	 
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ArrayList<Node> getNexts() {
		return nexts;
	}
	public void setNexts(ArrayList<Node> nexts) {
		this.nexts = nexts;
	}
	public Node(String value, ArrayList<Node> nexts) {
		super();
		this.value = value;
		this.nexts = nexts;
	}

}
