package problem2;

public class King implements Attackable{
    private String name;

    public King(String name) {
        this.name = name;
    }

    @Override
    public void attacked() {
        System.out.println("King " + name + " is under attack!");
    }
}
