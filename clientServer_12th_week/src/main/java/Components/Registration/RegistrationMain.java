package Components.Registration;

import Components.Student.StudentComponent;
import Framework.Event;
import Framework.EventId;
import Framework.EventQueue;
import Framework.RMIEventBus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class RegistrationMain {
    public static void main(String args[]) throws FileNotFoundException, IOException, NotBoundException {
        RMIEventBus eventBus = (RMIEventBus) Naming.lookup("EventBus");
        long componentId = eventBus.register();
        System.out.println("** StudentMain(ID:" + componentId + ") is successfully registered. \n");

        //필요한 파일 넣기
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
                    case Registration:
                        printLogEvent("Get", event);
                        eventBus.sendEvent(new Event(EventId.CourseCheck,event.getMessage()));
                        break;
                    case FinishRegistration:
                        printLogEvent("Get", event);
                        eventBus.sendEvent(new Event(EventId.ClientOutput,event.getMessage()));
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
    private static void printLogEvent(String comment, Event event) {
        System.out.println(
                "\n** " + comment + " the event(ID:" + event.getEventId() + ") message: " + event.getMessage());
    }
}
