package Equipments;

import Enums.EquipmentState;
import Enums.EquipmentType;

public class AirConditioner extends Equipment {

    private static EquipmentType equipmentType = EquipmentType.AIR_CONDITIONER;
    private static int powerConsumption = 10;

    public AirConditioner(EquipmentState equipmentState) {
        super(equipmentType, equipmentState, powerConsumption);
    }


}
