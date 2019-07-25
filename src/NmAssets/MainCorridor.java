package NmAssets;

import Enums.CorridorType;
import Equipments.AirConditioner;
import Equipments.Light;

public class MainCorridor extends Corridor {
    private Light light;
    private AirConditioner airConditioner;
    private static CorridorType corridorType = CorridorType.MAIN_CORRIDOR;

    MainCorridor(int corridorId) {
        super(corridorId, corridorType);
    }

    public Light getLight() {
        return light;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public static CorridorType getCorridorType() {
        return corridorType;
    }
}
