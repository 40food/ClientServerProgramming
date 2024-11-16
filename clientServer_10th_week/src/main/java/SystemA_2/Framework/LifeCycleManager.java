package SystemA_2.Framework;

import SystemA_2.Components.Add.AddFilter;
import SystemA_2.Components.Middle.MiddleFilter;
import SystemA_2.Components.Sink.SinkFilter;
import SystemA_2.Components.Source.SourceFilter;

public class LifeCycleManager {
    /**
     * 모든 EE 학생들은 23456 과목을 수강해야 한다.
     * 이들 과목을 수강 신청하지 않은 학생들을 골라 이들 과목 ID를 추가하시오.
     * */
    public static void main(String[] args) {
        try {
            CommonFilter sourceFilter = new SourceFilter("src/main/java/Students.txt");
            CommonFilter outputFilter = new SinkFilter("src/main/java/Output.txt");
            CommonFilter EEFilter = new MiddleFilter();
            CommonFilter addFilter = new AddFilter();

            sourceFilter.connectOutputTo(EEFilter);
            EEFilter.connectOutputTo(addFilter);
            addFilter.connectOutputTo(outputFilter);

            Thread thread1 = new Thread(sourceFilter);
            Thread thread2 = new Thread(EEFilter);
            Thread thread3 = new Thread(addFilter);
            Thread thread4 = new Thread(outputFilter);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
