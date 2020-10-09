/**
 * MedLinkedList class implement a linked list 
 * @author Malickbocoum
 *
 */



public class MedLinkedList {

	private static final String MedNode = null;
	MedNode head;
	MedNode tail;
	
	/**
	 * Default constructor set the head and tail
	 * of the list to null
	 */
	
	public MedLinkedList() {

		head = null;
		tail=null;

	}

	/**
	 * Checks for the empty list
	 * @return true if empty, false if not empty
	 */
	
	
	public boolean isEmpty() {

		if (head == null) {

			return true;
		}
		return false;
	}


	/**
	 * Inserts a patient to the correct place in the list.
	 * It also make a comparation between the patient and 
	 * also implement first come first serve
	 */
	
	public void insert(MedNode patient) {
		// Check for the empty list
		if(isEmpty() == true) {
			head = patient;
			tail = patient;
		}
		// If not empty, check for insertion at the head
		else if(patient.compareTo(head) < 0) {
			patient.setNext(head);
			head = patient;
		}
		// Else, insert in the correct spot
		else {
			// Search for the correct spot
			MedNode cur = head;
			MedNode prev = null;
			
			while(cur != null && patient.compareTo(cur) >= 0) {
				prev = cur;
				cur = cur.getNext();
			}
			// Add to the list
			patient.setNext(prev.getNext());
			prev.setNext(patient);
			if(cur == null) {
				tail = patient;
			}
		}
	}


	/**
	 * Removes from the list if it exists.
	 * @param and return item at the head of the list. 
	 */
	public MedNode remove() {
		if (head != null) {
			MedNode temp = head;
			head = head.getNext();
			return temp;
		}
		return null;
	}
	
	
	/**
	 * Iterative print by using toStringmethod
	 */
	
	public String toString() {
		String ret = "List of Patients\n---------------\n";
		
		MedNode cur = head;
		while( cur!=null) {	
			ret += cur.patient + "\n\n";
			cur= cur.next;
		}
		
		return ret + "\n";
	}

	

}
