package NmAssets;

import Enums.CorridorType;
import Enums.EquipmentState;
import Equipments.AirConditioner;
import Equipments.Light;

public class MainCorridor extends Corridor {
    private Light light;
    private AirConditioner airConditioner;
    private static CorridorType corridorType = CorridorType.MAIN_CORRIDOR;

    MainCorridor(int corridorId) {
        super(corridorId, corridorType);
        this.light = new Light(EquipmentState.OFF);
        this.airConditioner = new AirConditioner(EquipmentState.OFF);
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public static CorridorType getCorridorType() {
        return corridorType;
    }
}
