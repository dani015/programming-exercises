package sayhello;

public class Bulgarian extends BasePerson{
    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

