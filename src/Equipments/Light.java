package Equipments;

import Enums.EquipmentState;
import Enums.EquipmentType;

public class Light extends Equipment {

    private static EquipmentType equipmentType = EquipmentType.LIGHT;
    private static int powerConsumption = 5;

    public Light(EquipmentState equipmentState) {
        super(equipmentType, equipmentState, powerConsumption);
    }

}
