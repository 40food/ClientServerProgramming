package data.Registration;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Registration {
    protected String studentId;
    protected ArrayList<String> registCourses;

    public Registration(String inputString) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        this.studentId = stringTokenizer.nextToken();
        this.registCourses = new ArrayList<String>();
        while (stringTokenizer.hasMoreTokens()) {
            this.registCourses.add(stringTokenizer.nextToken());
        }
    }

    public String getStudentId(){return this.studentId;}
    public ArrayList<String> getRegistCourses(){return this.registCourses;}
}
