public class RawData {

    private String Model;
    private int EngineSpeed;
    private int EnginePower;
    private int CargoWeight;
    private String CargoType;
    private double Tire1Pressure;
    private int Tire1Age;
    private double Tire2Pressure;
    private int Tire2Age;
    private double Tire3Pressure;
    private int Tire3Age;
    private double Tire4Pressure;
    private int Tire4Age;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getEngineSpeed() {
        return EngineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        EngineSpeed = engineSpeed;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    public int getCargoWeight() {
        return CargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        CargoWeight = cargoWeight;
    }

    public String getCargoType() {
        return CargoType;
    }

    public void setCargoType(String cargoType) {
        CargoType = cargoType;
    }

    public double getTire1Pressure() {
        return Tire1Pressure;
    }

    public void setTire1Pressure(double tire1Pressure) {
        Tire1Pressure = tire1Pressure;
    }

    public int getTire1Age() {
        return Tire1Age;
    }

    public void setTire1Age(int tire1Age) {
        Tire1Age = tire1Age;
    }

    public double getTire2Pressure() {
        return Tire2Pressure;
    }

    public void setTire2Pressure(double tire2Pressure) {
        Tire2Pressure = tire2Pressure;
    }

    public int getTire2Age() {
        return Tire2Age;
    }

    public void setTire2Age(int tire2Age) {
        Tire2Age = tire2Age;
    }

    public double getTire3Pressure() {
        return Tire3Pressure;
    }

    public void setTire3Pressure(double tire3Pressure) {
        Tire3Pressure = tire3Pressure;
    }

    public int getTire3Age() {
        return Tire3Age;
    }

    public void setTire3Age(int tire3Age) {
        Tire3Age = tire3Age;
    }

    public double getTire4Pressure() {
        return Tire4Pressure;
    }

    public void setTire4Pressure(double tire4Pressure) {
        Tire4Pressure = tire4Pressure;
    }

    public int getTire4Age() {
        return Tire4Age;
    }

    public void setTire4Age(int tire4Age) {
        Tire4Age = tire4Age;
    }

    public RawData(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        Model = model;
        EngineSpeed = engineSpeed;
        EnginePower = enginePower;
        CargoWeight = cargoWeight;
        CargoType = cargoType;
        Tire1Pressure = tire1Pressure;
        Tire1Age = tire1Age;
        Tire2Pressure = tire2Pressure;
        Tire2Age = tire2Age;
        Tire3Pressure = tire3Pressure;
        Tire3Age = tire3Age;
        Tire4Pressure = tire4Pressure;
        Tire4Age = tire4Age;
    }

    @Override
    public String toString() {
        return "RawData{" +
                "Model='" + Model + '\'' +
                ", EngineSpeed=" + EngineSpeed +
                ", EnginePower=" + EnginePower +
                ", CargoWeight=" + CargoWeight +
                ", CargoType='" + CargoType + '\'' +
                ", Tire1Pressure=" + Tire1Pressure +
                ", Tire1Age=" + Tire1Age +
                ", Tire2Pressure=" + Tire2Pressure +
                ", Tire2Age=" + Tire2Age +
                ", Tire3Pressure=" + Tire3Pressure +
                ", Tire3Age=" + Tire3Age +
                ", Tire4Pressure=" + Tire4Pressure +
                ", Tire4Age=" + Tire4Age +
                '}';
    }
}
