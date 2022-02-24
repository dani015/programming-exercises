package problem2;

import java.util.Arrays;
import java.util.List;

public class Footman implements Attackable{
    private List<String> name;

    public Footman(List<String> name) {
        this.name = name;
    }

    @Override
    public void attacked() {
        for (String s : name) {
            System.out.println("Footman " + s + " is panicking!");
        }

    }

    public void killed(String name) {
        this.name.remove(name);
    }
}
