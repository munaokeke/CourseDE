package cmsc204Assign4;
/**
 * Programmer : Daniel Munachimso Okeke
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Allows the user to read the courses from a file or to enter the data by hand.
 * The input is read from a file or read from the text fields and is added to the data structure through the add method.
 * 
 * @author Justin Hixson
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Scanner;

public class CourseDBManager implements CourseDBManagerInterface {
	
	private CourseDBStructure dataMgr = new CourseDBStructure(20);

	public void readFile(File inputFile) throws FileNotFoundException{
		 try {
             Scanner fileData = new Scanner(inputFile);
             while(fileData.hasNext()) {
                     String id = fileData.next();
                     int crn = fileData.nextInt();
                     int numCredits = fileData.nextInt();
                     String roomNum = fileData.next();
                     String instructor = fileData.nextLine();
                     add(id, crn, numCredits, roomNum, instructor);
             }
             fileData.close();
     }
     catch(FileNotFoundException e) {
             System.out.print("File not found");
             e.getMessage();
     }
		
	}

	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		
		CourseDBElement newElement = new CourseDBElement(id, crn, credits, roomNum, instructor);
		dataMgr.add(newElement);
		
	}

	public ArrayList<String> showAll() {
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < dataMgr.getTableSize(); i++) {
			LinkedList<CourseDBElement> tempList = dataMgr.hashTable[i];
			
			if(tempList != null) {
				for(int j = 0; j < tempList.size(); j++) {
					CourseDBElement element = tempList.get(j);
					list.add(element.toString());
				}
			}
		}
		
		return list;
		
	}

	public CourseDBElement get(int crn) throws IOException  {
		try {
            return dataMgr.get(crn);
    } catch (IOException e) {
            e.getMessage();
    }
    return null;
	}

}