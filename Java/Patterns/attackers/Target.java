package attackers;

public interface Target {
    double getHealth();
    int getReward();

    void setHealth(double newHealth);
}
