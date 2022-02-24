package problem3;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }


    @Override
    public String getId() {
        return id;
    }

    public String getModel(){
        return model;
    }



    @Override
    public String toString() {
        return "Robot{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
