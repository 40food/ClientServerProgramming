package SystemB.Framework;

import SystemB.Components.Middle.MiddleFilter;
import SystemB.Components.Sink.SinkFilter;
import SystemB.Components.Sink.SinkFilter2;
import SystemB.Components.Source.SourceFilter;
import SystemB.Components.Source.SourceFilter2;

public class LifeCycleManager {
    /**
     * 선수 과목 정보가 들어있는 과목 정보(Courses.txt)를 학생 정보(Students.txt)와 같이 읽은 후,
     * 과목 정보의 선수 과목 기준에 만족하는 학생들과 만족하지 않는 학생 정보는 별도의 화일로 출력하라.
     * (예 : Output-1.txt, Output-2.txt)
     * */
    public static void main(String[] args) {
        try {
            CommonFilter courseSourceFilter = new SourceFilter("src/main/java/Courses.txt");
            CommonFilter stduentSourceFilter = new SourceFilter2("src/main/java/Students.txt");
            CommonFilter okOutputFilter = new SinkFilter("src/main/java/Output-1.txt");
            CommonFilter notOkOutputFilter = new SinkFilter2("src/main/java/Output-2.txt");
            CommonFilter preCourseFilter = new MiddleFilter();

            courseSourceFilter.connectOutputTo(1, preCourseFilter);
            stduentSourceFilter.connectOutputTo(2, preCourseFilter);
            preCourseFilter.connectOutputTo(1, okOutputFilter);
            preCourseFilter.connectOutputTo(2, notOkOutputFilter);

            Thread thread1 = new Thread(courseSourceFilter);
            Thread thread2 = new Thread(stduentSourceFilter);
            Thread thread3 = new Thread(okOutputFilter);
            Thread thread4 = new Thread(notOkOutputFilter);
            Thread thread5 = new Thread(preCourseFilter);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
