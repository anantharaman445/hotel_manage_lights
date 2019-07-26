package Operations;

import Enums.EquipmentState;
import Enums.SensorInpStates;
import Equipments.AirConditioner;
import Equipments.Light;
import NmAssets.SubCorridor;

public class ChangeAirConditionerStatus implements IChangeAirconditinerState {

    public SubCorridor changeAirConditionerStateForSubCorridor(SubCorridor subCorridor){

        if(subCorridor.getSensorInpStates().equals(SensorInpStates.MOVEMENT)){
            subCorridor.setAirConditioner(new AirConditioner(EquipmentState.ON));
        }

        else if(subCorridor.getSensorInpStates().equals(SensorInpStates.NO_MOVEMENT)){
            subCorridor.setAirConditioner(new AirConditioner(EquipmentState.OFF));
        }
        else
            subCorridor.setAirConditioner(new AirConditioner(EquipmentState.ON));

        return subCorridor;
    }
}
