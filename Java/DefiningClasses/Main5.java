import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        List<RawData> asd = new ArrayList<>();

        while (count-- > 0){
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            int EngineSpeed = Integer.parseInt(input[1]);
            int EnginePower = Integer.parseInt(input[2]);
            int CargoWeight = Integer.parseInt(input[3]);
            String CargoType = input[4];
            double Tire1Pressure = Double.parseDouble(input[5]);
            int Tire1Age = Integer.parseInt(input[6]);
            double Tire2Pressure = Double.parseDouble(input[7]);
            int Tire2Age = Integer.parseInt(input[8]);
            double Tire3Pressure = Double.parseDouble(input[9]);
            int Tire3Age = Integer.parseInt(input[10]);
            double Tire4Pressure = Double.parseDouble(input[11]);
            int Tire4Age = Integer.parseInt(input[12]);

            RawData rawData = new RawData(model, EngineSpeed, EnginePower, CargoWeight,
                    CargoType, Tire1Pressure, Tire1Age, Tire2Pressure, Tire2Age, Tire3Pressure, Tire3Age, Tire4Pressure, Tire4Age);
            asd.add(rawData);
        }



    }
}
