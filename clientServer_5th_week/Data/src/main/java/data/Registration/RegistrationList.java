package data.Registration;

import data.Course.Course;
import data.Course.CourseList;
import data.Student.StudentList;
import data.exception.NullDataException;
import org.example.Request;

import java.io.*;
import java.util.ArrayList;

public class RegistrationList {
    protected ArrayList<Registration> vRegistration;
    protected String fileName;

    public RegistrationList(String sRegistrationFileName) throws IOException {
        fileName=sRegistrationFileName;
        BufferedReader registrationFile = new BufferedReader(new FileReader(sRegistrationFileName));
        this.vRegistration = new ArrayList<Registration>();
        while (registrationFile.ready()) {
            String regiInfo = registrationFile.readLine();
            if (!regiInfo.equals("")) {
                this.vRegistration.add(new Registration(regiInfo));
            }
        }
        registrationFile.close();
    }

    public ArrayList<Registration> getAllRegistration() {
        return this.vRegistration;
    }
    public Registration getRegistration(String id){
        for(Registration r:vRegistration){
            if(r.studentId.equals(id)) return r;
        }
        return null;
    }

    public boolean addRegist(Request request) {
        try {
            String[] registRequest=request.getPayload().split(" ");

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            boolean studentFound = false;

            //기존 registration 수정
            for (Registration r:vRegistration){
                if(r.studentId.equals(registRequest[0])){
                    r.registCourses.add(registRequest[1]);
                    studentFound=true;
                }
                StringBuilder courses= new StringBuilder();
                for(String c:r.registCourses){
                    courses.append(" ").append(c);
                }
                writer.write(r.studentId+courses);
                writer.newLine();
            }

            if(!studentFound){
                writer.write(registRequest[0]+" "+registRequest[1]);
            }
            reader.close();
            writer.close();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
