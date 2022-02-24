package problem1;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangeListener> nameChangeListeners;

    public Dispatcher() {
        this.name = "";
        this.nameChangeListeners = new ArrayList<>();
    }

    public void addNameChangeListener(NameChangeListener listener) {
        this.nameChangeListeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.nameChangeListeners.remove(listener);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fireNameChangeEvent() {
        Event event = new Event(this.name);
        for (NameChangeListener nameChangeListener : nameChangeListeners) {
            nameChangeListener.handleChangedName(event);
        }
    }
}
