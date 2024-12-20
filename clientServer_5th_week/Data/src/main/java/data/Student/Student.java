package data.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
    protected String id;
    protected String pw;
	protected String studentId;
    protected String name;
    protected String department;
    protected ArrayList<String> completedCoursesList;


    public Student(String inputString) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        this.id=stringTokenizer.nextToken();
        this.pw=stringTokenizer.nextToken();
    	this.studentId = stringTokenizer.nextToken();
    	this.name = stringTokenizer.nextToken();
    	this.department = stringTokenizer.nextToken();
    	this.completedCoursesList = new ArrayList<String>();
    	while (stringTokenizer.hasMoreTokens()) {
    		this.completedCoursesList.add(stringTokenizer.nextToken());
    	}
    }
    public String getId(){return id;}
    public String getPw(){return pw;}
    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<String> getCompletedCoursesList() {
        return completedCoursesList;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        String stringReturn = this.studentId + " " + this.name + " " + this.department;
        for (int i = 0; i < this.completedCoursesList.size(); i++) {
            stringReturn = stringReturn + " " + this.completedCoursesList.get(i).toString();
        }
        return stringReturn;
    }
}
