package attackers;

public class Dragon implements Target{
    private double health;
    private int reward;
    private String id;


    public Dragon(double health, int reward, String id) {
        this.health = health;
        this.reward = reward;
        this.id = id;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public int getReward() {
        return this.reward;
    }

    @Override
    public void setHealth(double newHealth) {
        this.health = health;
    }


}
