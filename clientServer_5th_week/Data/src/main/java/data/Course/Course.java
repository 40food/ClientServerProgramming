package data.Course;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Course implements Serializable{

	private static final long serialVersionUID = 1L;

    protected String courseId;
    protected String professor;
    protected String courseName;
    protected ArrayList<String> preClass;
    public String getCourseId() {return courseId;}

    public String getProfessor() {return professor;}

    public String getCourseName() {return courseName;}

    public ArrayList<String> getPreClass() {return preClass;}

    public Course(String inputString) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
    	this.courseId = stringTokenizer.nextToken();
    	this.professor = stringTokenizer.nextToken();
    	this.courseName = stringTokenizer.nextToken();
    	this.preClass = new ArrayList<String>();
    	while (stringTokenizer.hasMoreTokens()) {
    		this.preClass.add(stringTokenizer.nextToken());
    	}
    }

    public String toString() {
        String stringReturn = this.courseId + " " + this.professor + " " + this.courseName;
        for (int i = 0; i < this.preClass.size(); i++) {
            stringReturn = stringReturn + " " + this.preClass.get(i).toString();
        }
        return stringReturn;
    }
}
