package swat018.demospring51;

import org.springframework.stereotype.Component;

@Component
public class SimpleEventService implements EventService{
    @PerLogging
    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");
    }
    @PerLogging
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    public void deleteEvent() {
        System.out.println("delete an event");
    }
}
