/**
 * Copyright(c) 2021 All rights reserved by Jungho Kim in Myungji University.
 */
package src.Framework;

import src.Components.Middle.MiddleFilter;
import src.Components.Sink.SinkFilter;
import src.Components.Source.SourceFilter;

public class LifeCycleManager {
    public static void main(String[] args) {
        try {
            //이해를 위한 임시 이름, filterSource 등으로 기능을 명시 권장
            CommonFilter filter1 = new SourceFilter("src/main/java/Students.txt");
            CommonFilter filter2 = new SinkFilter("src/main/java/Output.txt");
            CommonFilter filter3 = new MiddleFilter();
            
            filter1.connectOutputTo(filter3);
            filter3.connectOutputTo(filter2);
            
            Thread thread1 = new Thread(filter1);
            Thread thread2 = new Thread(filter2);
            Thread thread3 = new Thread(filter3);
            
            thread1.start();
            thread2.start();
            thread3.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
