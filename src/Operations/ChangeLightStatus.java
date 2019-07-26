package Operations;

import Enums.EquipmentState;
import Enums.SensorInpStates;
import Equipments.Light;
import NmAssets.Floor;
import NmAssets.Hotel;
import NmAssets.SubCorridor;

public class ChangeLightStatus implements IChangeLightStatus {

    public SubCorridor changeLightStateForFloor(SubCorridor subCorridor){

        if(subCorridor.getSensorInpStates().equals(SensorInpStates.MOVEMENT)){
           subCorridor.setLight(new Light(EquipmentState.ON));
        }

        else if(subCorridor.getSensorInpStates().equals(SensorInpStates.NO_MOVEMENT)){
            subCorridor.setLight(new Light(EquipmentState.OFF));
        }
        else
            subCorridor.setLight(new Light(EquipmentState.OFF));

        return subCorridor;
    }
}
