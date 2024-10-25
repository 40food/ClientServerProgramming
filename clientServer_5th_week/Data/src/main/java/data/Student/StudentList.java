package data.Student;

import data.exception.NullDataException;

import java.io.*;
import java.util.ArrayList;

public class StudentList {
	protected ArrayList<Student> vStudent;
	private String filePath;
	
	public StudentList(String sStudentFileName) throws IOException {
		BufferedReader objStudentFile = new BufferedReader(new FileReader(sStudentFileName));
		this.vStudent = new ArrayList<Student>();
		while (objStudentFile.ready()) {
			String stuInfo = objStudentFile.readLine();
			if (!stuInfo.equals("")) {
				this.vStudent.add(new Student(stuInfo));
			}
		}
		objStudentFile.close();
		filePath=sStudentFileName;
	}

	public ArrayList<Student> getAllStudentRecords() throws NullDataException {
		if(this.vStudent.isEmpty()) throw new NullDataException("학생 데이터가 없습니다.");
		return this.vStudent;
	}
	public Student getStudent(String id) throws NullDataException{
		for(Student s:vStudent){
			if(s.getStudentId().equals(id)) return s;
		}
		throw new NullDataException("해당하는 학생이 없습니다.");
	}
	public boolean addStudentRecord(String studentInfo){
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
			bufferedWriter.write(studentInfo);
			bufferedWriter.newLine();
			bufferedWriter.close();
			return true;
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public boolean deleteStudentRecord(String studentId){
		try {
			File studentFile = new File(filePath);
			File tempFile = new File("studentTemp.txt");
			BufferedReader reader = new BufferedReader(new FileReader(studentFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				if (!currentLine.contains(studentId)) {
					writer.write(currentLine + System.lineSeparator());
				}
			}
			reader.close();
			writer.close();
			if (!studentFile.delete()) {
				System.out.println("원본 파일을 삭제할 수 없습니다.");
				return false;
			}
			if (!tempFile.renameTo(studentFile)) {
				System.out.println("임시 파일을 원본 파일로 대체할 수 없습니다.");
				return false;
			}
			return true;
		} catch (IOException e) {
            throw new RuntimeException(e);
        }
	}
}
