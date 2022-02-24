package problem2;

import java.util.List;

public class RoyalGuard implements Attackable{
    private List<String> name;

    public RoyalGuard(List<String> name) {
        this.name = name;
    }

    @Override
    public void attacked() {
        for (String s : name) {
            System.out.println("Royal Guard " + s + " is defending!");
        }
    }

    public void killed(String name) {
        this.name.remove(name);
    }
}
