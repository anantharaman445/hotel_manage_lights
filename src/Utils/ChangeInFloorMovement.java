package Utils;

import Enums.EquipmentState;
import Enums.SensorInpStates;
import NmAssets.Floor;
import NmAssets.SubCorridor;
import Operations.ChangeAirConditionerStatus;
import Operations.ChangeLightStatus;
import Operations.IChangeAirconditinerState;
import Operations.IChangeLightStatus;

public class ChangeInFloorMovement implements IChangeFloorMovement {

    private IChangeLightStatus iChangeLightStatus;
    private IChangeAirconditinerState iChangeAirconditinerState;

    public Floor changeSubCorridorLightStatus(Floor floor, int subCorridorId, SensorInpStates sensorInpStates){

        iChangeLightStatus = new ChangeLightStatus();

            SubCorridor  subCorridor = floor.getSubCorridorHashMap().get(subCorridorId);

                subCorridor.setSensorInpStates(sensorInpStates);
                iChangeLightStatus.changeLightStateForFloor(subCorridor);
        if(subCorridor.getLight().getEquipmentState().equals(EquipmentState.ON)) floor.setTotalPowerConsumed(floor.getTotalPowerConsumed()+ 5);
        return floor;
    }

    public Floor changeSubCorridorAirConditionerStatus(Floor floor, int subCorridorId, SensorInpStates sensorInpStates){
        iChangeAirconditinerState = new ChangeAirConditionerStatus();

        for(int i=1; i<= floor.getMainCorridorHashMap().size(); i++){
            SubCorridor  subCorridor = floor.getSubCorridorHashMap().get(i);
            if(SensorInpStates.MOVEMENT.equals(sensorInpStates)){
                if(subCorridorId != subCorridor.getCorridorId()){
                    subCorridor.setSensorInpStates(SensorInpStates.NO_MOVEMENT);
                    iChangeAirconditinerState.changeAirConditionerStateForSubCorridor(subCorridor);
                }

            }
            else{
                subCorridor.setSensorInpStates(SensorInpStates.DEFAULT);
                iChangeAirconditinerState.changeAirConditionerStateForSubCorridor(subCorridor);
            }
            if(subCorridor.getAirConditioner().getEquipmentState().equals(EquipmentState.ON)) floor.setTotalPowerConsumed(floor.getTotalPowerConsumed()+ 5);

        }
        return floor;
    }
}
