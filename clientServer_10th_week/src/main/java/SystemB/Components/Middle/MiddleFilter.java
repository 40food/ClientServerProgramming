/**
 * Copyright(c) 2021 All rights reserved by Jungho Kim in Myungji University.
 */
package SystemB.Components.Middle;

import SystemB.Framework.CommonFilterImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MiddleFilter extends CommonFilterImpl {
    @Override
    public boolean specificComputationForFilter() throws IOException {
        boolean isCourseComplete=false;
        int numOfBlank = 0;

        int course_byte_read=0;
        int course_idx=0;
        byte[] course_buffer=new byte[64]; //true로 종료되는 student와 다르게 유지되므로 초기화
        ArrayList<String[]> courses=new ArrayList<>(); //초기화x

        int student_byte_read = 0;
        int student_idx=0;
        int student_course_idx=0;
        byte[] student_buffer=new byte[64];
        byte[] student_course_buffer=new byte[64];
        String[] studentsCourse;
        boolean ok=true;

        while(true){

            //과목 데이터 처리
            if(!isCourseComplete){
                while(true){
                    while(course_byte_read!='\n'&&course_byte_read!=-1){
                        course_byte_read=in.read();
                        //계행문자 처리 안 하면 비교할 때 어려움
                        if (course_byte_read == '\r' || course_byte_read == '\n') continue;
                        if(course_byte_read==' ') numOfBlank++;
                        if(course_byte_read!=-1&&(numOfBlank<1||numOfBlank>=3)) course_buffer[course_idx++]=(byte)course_byte_read;
                    }
                    if(course_idx>0){//마찬가지로 계행문자때문에 생긴 빈 buffer 저장 안 하기 위해
                        courses.add(new String(course_buffer, 0, course_idx).split(" "));//길이만큼 자르기 중요!
                    }
                    numOfBlank=0;
                    course_idx=0;
                    course_buffer=new byte[64];
                    if (course_byte_read == -1) break;
                    course_byte_read='\0';
                }
                isCourseComplete=true;
            }

            //학생 데이터 처리
            while(student_byte_read!='\n'&&student_byte_read!=-1){
                student_byte_read=in2.read();
                if (student_byte_read == '\r' || student_byte_read == '\n') continue;
                if(student_byte_read==' ') numOfBlank++;
                if(student_byte_read!=-1) student_buffer[student_idx++]=(byte)student_byte_read;
                if(student_byte_read!=-1&&numOfBlank>=4) student_course_buffer[student_course_idx++]=(byte) student_byte_read;
            }
            if(student_course_idx>0){
                studentsCourse=new String(student_course_buffer,0, student_course_idx).split(" ");
                //학생이 듣는 과목들 전체를 선수과목 목록에서 확인
                for(String studentCourse:studentsCourse){
                    for(String[] course:courses){
                        //선수과목 목록에서 학생이 듣는 과목을 찾으면
                        if(course[0].equals(studentCourse)){
                            //학생이 듣는 과목에 선수과목들이 모두 있는지 확인
                            for (String c : course) {
                                if (!Arrays.asList(studentsCourse).contains(c)) {
                                    ok=false;
                                    break;
                                }
                            }
                        }
                    }}
            }

            if(ok) {
                for(int i = 0; i<student_idx; i++) {
                    out.write((char)student_buffer[i]);
                }
                if (student_idx > 0) out.write('\n');
            }else{
                for(int i=0;i<student_idx;i++){
                    out2.write((char)student_buffer[i]);
                }
                out2.write('\n');
                ok=true;
            }
            if (student_byte_read == -1) return true;
            numOfBlank=0;
            student_byte_read = '\0';
            student_idx = 0;
            student_course_idx=0;
        }
    }
}
