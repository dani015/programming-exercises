package problem1;

import java.util.EventObject;

public class Event extends EventObject {
    private String source;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public Event(Object source) {
        super(source);

    }


}
