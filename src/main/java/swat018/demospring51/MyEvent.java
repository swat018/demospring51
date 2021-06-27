package swat018.demospring51;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private int data;

    private Object source;

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
