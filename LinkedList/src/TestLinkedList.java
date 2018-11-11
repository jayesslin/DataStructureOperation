
public class TestLinkedList {
	//≤‚ ‘¿‡
		public static void main(String args[]) {
			LinkedListCreation Link = new LinkedListCreation();
			Link.addNode(1);
			Link.addNode(3);
			Link.addNode(5);
			Link.addNode(18);
			Link.addNode(36);
			
			System.out.println(Link.length()+1);
			Link.printList();
			
			System.out.println(Link.deleteNode(3));
			Link.printList();
			System.out.println();
			System.out.println(Link.length()+1);
		}
}
