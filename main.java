import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node= new Node("A", new ArrayList<Node>());
		
		node.nexts.add(new Node("B", new ArrayList<Node>()));
		node.nexts.add(new Node("C", new ArrayList<Node>()));
		node.nexts.add(new Node("D", new ArrayList<Node>()));
		
		node.getNexts().get(1).nexts.add(new Node("E", new ArrayList<Node>()));
		node.getNexts().get(1).nexts.add(new Node("F", new ArrayList<Node>()));
		
		Algorithms alg = new Algorithms(node);
		alg.print(node);
		

	}

}
