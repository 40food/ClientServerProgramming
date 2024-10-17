package data.Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CourseList {
	protected ArrayList<Course> vCourse;


	public CourseList(String sStudentFileName) throws FileNotFoundException, IOException {
		BufferedReader objStudentFile = new BufferedReader(new FileReader(sStudentFileName));
		this.vCourse = new ArrayList<Course>();
		while (objStudentFile.ready()) {
			String corInfo = objStudentFile.readLine();
			if (!corInfo.equals("")) {
				this.vCourse.add(new Course(corInfo));
			}
		}
		objStudentFile.close();
	}

	public ArrayList<Course> getAllCourseRecords() {
		return this.vCourse;
	}

	public boolean isRegisteredCourse(String sSID) {
		for (int i = 0; i < this.vCourse.size(); i++) {
			Course objCourse = (Course) this.vCourse.get(i);
			if (objCourse.match(sSID)) {
				return true;
			}
		}
		return false;
	}
}
