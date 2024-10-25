package data.Course;

import data.exception.NullDataException;

import java.io.*;
import java.util.ArrayList;

public class CourseList {
	protected ArrayList<Course> vCourse;
	protected String filePath;

	public CourseList(String filePath) throws IOException {
		BufferedReader objStudentFile = new BufferedReader(new FileReader(filePath));
		this.vCourse = new ArrayList<Course>();
		while (objStudentFile.ready()) {
			String corInfo = objStudentFile.readLine();
			if (!corInfo.equals("")) {
				this.vCourse.add(new Course(corInfo));
			}
		}
		objStudentFile.close();
		this.filePath=filePath;
	}

	public ArrayList<Course> getAllCourseRecords() {
		return this.vCourse;
	}
	public Course getCourse(String id) throws NullDataException{
		for(Course c:vCourse){
			if(c.getCourseId().equals(id)) return c;
		}
		throw new NullDataException("해당하는 과목이 없습니다.");
	}

	public boolean addCourse(String courseInfo) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
			bufferedWriter.write(courseInfo);
			bufferedWriter.newLine();
			bufferedWriter.close();
			return true;
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean deleteCourse(String courseId) {
		try {
			File courseFile = new File(filePath);
			File tempFile = new File("courseTemp.txt");
			BufferedReader reader = new BufferedReader(new FileReader(courseFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				if (!currentLine.contains(courseId)) {
					writer.write(currentLine + System.lineSeparator());
				}
			}
			reader.close();
			writer.close();
			if (!courseFile.delete()) {
				System.out.println("원본 파일을 삭제할 수 없습니다.");
				return false;
			}
			if (!tempFile.renameTo(courseFile)) {
				System.out.println("임시 파일을 원본 파일로 대체할 수 없습니다.");
				return false;
			}
			return true;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
