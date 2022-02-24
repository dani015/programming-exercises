package observers;

abstract class Observer {
    public void update(String message) {
        System.out.println(message);
    }
}
