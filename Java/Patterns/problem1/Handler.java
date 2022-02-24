package problem1;

public class Handler implements NameChangeListener{
    @Override
    public void handleChangedName(Event event) {
        System.out.println("Dispatcher's name changed to " + event.getSource() + ".");
    }
}
