package data.Student;

import data.exception.NullDataException;

import java.io.*;
import java.util.ArrayList;

public class StudentList {
	protected ArrayList<Student> vStudent;
	
	public StudentList(String sStudentFileName) throws FileNotFoundException, IOException {
		BufferedReader objStudentFile = new BufferedReader(new FileReader(sStudentFileName));
		this.vStudent = new ArrayList<Student>();
		while (objStudentFile.ready()) {
			String stuInfo = objStudentFile.readLine();
			if (!stuInfo.equals("")) {
				this.vStudent.add(new Student(stuInfo));
			}
		}
		objStudentFile.close();
	}

	public ArrayList<Student> getAllStudentRecords() throws NullDataException {
		if(this.vStudent.isEmpty()) throw new NullDataException("===student 데이터가 없습니다.");
		return this.vStudent;
	}
	public boolean addStudentRecord(String sStudentFileName,String studentInfo){ //원한다면 실패 이유 exception 추가
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sStudentFileName, true));
			bufferedWriter.write(studentInfo);
			bufferedWriter.newLine();
			bufferedWriter.close();
			return true;
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public boolean deleteStudentRecord(String sStudentFileName,String studentId){
		try {
			File studentFile = new File(sStudentFileName);
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

	public Student isRegisteredStudent(String id,String pw) {
		for (int i = 0; i < this.vStudent.size(); i++) {
			Student objStudent = (Student) this.vStudent.get(i);
			if (objStudent.match(id,pw)) {
				return this.vStudent.get(i);
			}
		}
		return null;
	}
}
