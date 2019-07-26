package Operations;

import Enums.SensorInpStates;
import NmAssets.SubCorridor;

public interface IChangeLightStatus {
    public SubCorridor changeLightStateForFloor(SubCorridor subCorridor);
}
