package cmsc204Assign4;
/**
 * Programmer : Daniel Munachimso Okeke
*/
import java.io.*;
import java.util.*;

public interface CourseDBManagerInterface {

	public void add(String id, int crn, int credits, String roomNum, String instructor);
	
	public CourseDBElement get(int crn) throws IOException;
	
	public void readFile(File input) throws FileNotFoundException;

	public ArrayList<String> showAll();

}