public class Algorithms {

	Node root;
	Node curr;
	int dash = 0;

	public Algorithms(Node root) {
		this.root = root;
		curr = root;
	}
	public void print(Node curr){   
       printDash();
        System.out.println(curr.getValue());
            dash ++;
        for (int i = 0; i < curr.getNexts().size(); i++){            
            print(curr.getNexts().get(i));       
        }
        dash--;    
    }
	public void printDash() {
		for (int i = 0; i < dash; i++) {
			System.out.print("-");
		}
	}
}
