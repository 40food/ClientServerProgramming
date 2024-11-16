package SystemA_3.Framework;

import SystemA_3.Components.Delete.DeleteFilter;
import SystemA_3.Components.ID.IDFilter;
import SystemA_3.Components.Middle.MiddleFilter;
import SystemA_3.Components.Sink.SinkFilter;
import SystemA_3.Components.Source.SourceFilter;

public class LifeCycleManager {
    /**
     * 2013학번 학생들 중, CS가 아닌 사람은 17651이나 17652 과목을 들을 수 없다.
     * CS가 아닌 학생 중에 이 과목 ID를 수강한 학생들을 골라 이 과목 ID를 삭제하시오.
     * */
    public static void main(String[] args) {
        try {
            CommonFilter sourceFilter = new SourceFilter("src/main/java/Students.txt");
            CommonFilter outputFilter = new SinkFilter("src/main/java/Output.txt");
            CommonFilter IDFilter=new IDFilter();
            CommonFilter NotCSFilter = new MiddleFilter();
            CommonFilter deleteFilter = new DeleteFilter();

            sourceFilter.connectOutputTo(IDFilter);
            IDFilter.connectOutputTo(NotCSFilter);
            NotCSFilter.connectOutputTo(deleteFilter);
            deleteFilter.connectOutputTo(outputFilter);

            Thread thread1 = new Thread(sourceFilter);
            Thread thread2 = new Thread(IDFilter);
            Thread thread3 = new Thread(NotCSFilter);
            Thread thread4 = new Thread(deleteFilter);
            Thread thread5 = new Thread(outputFilter);

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
