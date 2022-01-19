
/**
 * CourseDBElement consists of five attributes: 
 * the Course ID, the CRN, the number of credits, the room number, and the instructor name.
 * 
 * 
 *
 */
/**
 * Programmer : Daniel Munachimso Okeke
*/
public class CourseDBElement implements Comparable {

	private String courseID;
	private int crn;
	private int credits;
	private String roomNumber;
	private String name;
	
	public CourseDBElement() {
		courseID = null;
		crn = 0;
		credits = 0;
		roomNumber = null;
		name = null;
	}
	
	public CourseDBElement(String courseID, int crn, int credits, String roomNumber, String name) {
		this.courseID = courseID;
		this.crn = crn;
		this.credits = credits;
		this.roomNumber = roomNumber;
		this.name = name;
	}
	
	public void setCRN(int crn) {
		this.crn = crn;
	}
	
	public int getCRN() {
		return crn;
	}

	
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public void setNumOfCredits(int credits) {
		this.credits = credits;
	}
	
	public int getNumOfCredits() {
		return credits;
	}
	
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
    
	@Override
	public int compareTo(CourseDBElement element) {
		return this.crn - element.crn;
	}
	

	public int hashCode() {
		return ("" + crn).hashCode();
	}
	

	public String toString() {
		String str = "Course: " + courseID + " CRN: " + crn + " Credit: " + credits + " Instructor: " + name + " Room: " + roomNumber;
		return str;
	}

}
