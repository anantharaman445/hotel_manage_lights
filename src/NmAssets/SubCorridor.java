package NmAssets;

import Enums.CorridorType;
import Enums.SensorInpStates;
import Equipments.AirConditioner;
import Equipments.Light;

public class SubCorridor extends Corridor {

    private Light light;
    private AirConditioner airConditioner;
    private static CorridorType corridorType = CorridorType.SUB_CORRIDOR;
    private SensorInpStates sensorInpStates;

    SubCorridor(int corridorId) {
        super(corridorId, corridorType);
        this.sensorInpStates = SensorInpStates.DEFAULT;
    }

    public SensorInpStates getSensorInpStates() {
        return sensorInpStates;
    }

    public void setSensorInpStates(SensorInpStates sensorInpStates) {
        this.sensorInpStates = sensorInpStates;
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

    public void setLight(Light light) {
        this.light = light;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
}
