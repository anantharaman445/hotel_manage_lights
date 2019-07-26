package Utils;

import NmAssets.Floor;
import NmAssets.SubCorridor;

public class CheckFloorResults implements ICheckFloorResults {

    public String checkSubCorridorLights(Floor floor, int subCorridorId){
        SubCorridor subCorridor = floor.getSubCorridorHashMap().get(subCorridorId);
        String lightStatus = subCorridor.getLight().getEquipmentState().toString();
        return lightStatus;
    }
}
