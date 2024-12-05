/**
 * Copyright(c) 2021 All rights reserved by Jungho Kim in MyungJi University 
 */

package Components.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.Arrays;

import Framework.Event;
import Framework.EventId;
import Framework.EventQueue;
import Framework.RMIEventBus;

public class StudentMain {
	public static void main(String args[]) throws FileNotFoundException, IOException, NotBoundException {
		RMIEventBus eventBus = (RMIEventBus) Naming.lookup("EventBus");
		long componentId = eventBus.register();
		System.out.println("** StudentMain(ID:" + componentId + ") is successfully registered. \n");

		StudentComponent studentsList = new StudentComponent("src/main/java/Students.txt");
		Event event = null;
		boolean done = false;
		while (!done) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			EventQueue eventQueue = eventBus.getEventQueue(componentId);
			for (int i = 0; i < eventQueue.getSize(); i++) {
				event = eventQueue.getEvent();
				switch (event.getEventId()) {
				case ListStudents:
					printLogEvent("Get", event);
					eventBus.sendEvent(new Event(EventId.ClientOutput, makeStudentList(studentsList)));
					break;
				case RegisterStudents:
					printLogEvent("Get", event);
					eventBus.sendEvent(new Event(EventId.ClientOutput, registerStudent(studentsList, event.getMessage())));
					break;
				case DeleteStudents:
					printLogEvent("Get",event); //여기서 EventId.DeleteStudent하면 (이벤트 아이디를 찾아)여기로 돌아와 루프가 생김
					eventBus.sendEvent(new Event(EventId.ClientOutput,deleteStudent(studentsList,event.getMessage())));
					break;
				case StudentCheck:
					if(event.getMessage()==null) eventBus.sendEvent(new Event(EventId.FinishRegistration,"false: 해당하는 Course가 존재하지 않음."));
					else eventBus.sendEvent(new Event(EventId.FinishRegistration,checkStudent(studentsList,event.getMessage())));
					break;
				case QuitTheSystem:
					printLogEvent("Get", event);
					eventBus.unRegister(componentId);
					done = true;
					break;
				default:
					break;
				}
			}
		}
	}
	private static String registerStudent(StudentComponent studentsList, String message) {
		Student  student = new Student(message);
		if (!studentsList.isRegisteredStudent(student.studentId)) {
			studentsList.vStudent.add(student);
			return "This student is successfully added.";
		} else
			return "This student is already registered.";
	}
	private static String makeStudentList(StudentComponent studentsList) {
		String returnString = "";
		for (int j = 0; j < studentsList.vStudent.size(); j++) {
			returnString += studentsList.getStudentList().get(j).getString() + "\n";
		}
		return returnString;
	}
	private static String deleteStudent(StudentComponent studentsList, String id){
		if(studentsList.isRegisteredStudent(id)){
			studentsList.vStudent.removeIf(student -> student.studentId.equals(id));
			return "This Student is successfully deleted.\n";
		}else return "There is no student have ID: "+id+"\n";
	}
	private static String checkStudent(StudentComponent studentList, String id){
		String[] ids=id.split(" ");
		if(!studentList.isRegisteredStudent(ids[0])) return "false: 학생이 존재하지 않음.";
		else{
			ArrayList<String> completeCourse=studentList.getCompleteCourse(ids[0]);
			boolean match=Arrays.stream(ids)
				.skip(2)  // 인덱스 두 개를 건너뜀
				.allMatch(completeCourse::contains);
			if(match) return "true: "+ids[0]+"의 "+ids[1]+" 수업 수강신청 성공.";
			else return "false: 선수과목을 다 듣지 않음.";
		}
	}
	private static void printLogEvent(String comment, Event event) {
		System.out.println(
				"\n** " + comment + " the event(ID:" + event.getEventId() + ") message: " + event.getMessage());
	}
}
