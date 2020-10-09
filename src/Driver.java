

     /**
	 * The main method creates the MedLinkedList and invokes its print method
	 */


public class Driver {

	public static void main(String[] args) {
		
		
		MedLinkedList list = new MedLinkedList();
		Patient patient = new Patient("Frank Sinatra", 87, 'M', 2);
		MedNode patientNode = new MedNode(patient);
		list.insert(patientNode);

		
		patient = new Patient("Jennifer Granholm", 45,'F', 3);
		patientNode = new MedNode(patient);
		list.insert(patientNode);

		patient = new Patient("Patrick Kinnicutt", 89, 'M', 0);
		patientNode = new MedNode(patient);
		list.insert(patientNode);
		
		patient = new Patient("Sarah Palin",46, 'F', 0);
		patientNode = new MedNode(patient);
		list.insert(patientNode);
		
		patient = new Patient("Bill Clinton",65, 'M', 4);
		patientNode = new MedNode(patient);
		list.insert(patientNode);
		
		
		patient = new Patient("Barack Obama",48, 'M', 1);
		patientNode = new MedNode(patient);
		list.insert(patientNode);
		
		
		System.out.println(list);
		
		System.out.println("The removed node is: " + list.remove() + "\n");
		
		System.out.println(list);
		
	}

	
	
	
	/**
	 * Iterative print method
	 * it traverses the list and prints all of its elements
	 */
	
	public static void printList(MedLinkedList list) {
		
		System.out.println("\n\n******My List:**********");
		
		MedNode cur = list.head;
		while( cur!=null) {	
			System.out.println(cur.patient);
			cur= cur.next;
		}
	}
}
