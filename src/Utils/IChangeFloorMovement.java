package Utils;

import Enums.SensorInpStates;
import NmAssets.Floor;

public interface IChangeFloorMovement {
    public Floor changeSubCorridorLightStatus(Floor floor, int subCorridorId, SensorInpStates sensorInpStates);

    public Floor changeSubCorridorAirConditionerStatus(Floor floor, int subCorridorId, SensorInpStates sensorInpStates);
}
