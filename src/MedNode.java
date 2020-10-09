
/** The MedNode class represents a single node
 * of a singly linked list
 */

public class MedNode {
    Patient patient;// point to the head node
    MedNode next;//    point to the tail node
    
    
    
    /**  Default constructor
     *  patient and next assign to null
     */
    
	public MedNode() {
		patient= null;
		next= null;
	}
	/**  constructor with parameter
     *  nam is an element that is store in the node
     */
    
	
	public MedNode( Patient nam) {
		this.patient=nam;
	}
	
	
	/** getter and setter method to set and 
	 * get the value
	 */
	
	public void setNext(MedNode K) {
		next = K ;
	}
	public MedNode getNext() {
		return next;
	}
	public void SetPatient( Patient G) {
		patient= G;
	}
	/**
	 * Compare the priority of patient to the new one
	 * and see which is greater  
	 * @param m
	 * @return
	 */
	
	public int compareTo(MedNode m) {
		int result;
		return result= this.patient.priority - m.patient.priority;
	}
	/** the toString compute the string representation of 
	 * the list and return the string form of the list
	 */
	public String toString() {
		return patient.toString();
	}
	
	
}
