
/**
 * Patient class
 * @author Malickbocoum
 *
 */
public class Patient {
     String name;
     int age;
     char gender;
     int priority;
	public Patient() {
		name="none";
		age=0;
		gender='M';
		priority=0;
	}
	/**  constructor with  different parameters
     * name is the element to store in this.name
     * gender is the element  to store in this.gender
     * age is the element to store in this.age 
     * priority is the element to store in this . priority
     */
    
	
 public Patient(String name, int age,char gender, int priority) {
	 
	 this.name= name;
	 this.age= age;
	 this.gender=gender;
	 this.priority= priority;
 }
 
 
 /** the toString compute the string representation of 
	 * the list and return the string form of the list
	 */
 public String toString() {
     return "Patient:" + name+'\n'+
             "age:"+age +'\n'+ "gender:" + gender+'\n' +
             "priority:" + priority ;
 }
}
