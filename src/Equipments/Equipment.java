package Equipments;

import Enums.EquipmentState;
import Enums.EquipmentType;

public class Equipment {
    protected EquipmentType equipmentType;
    protected EquipmentState equipmentState;
    protected  int powerConsumption ;

    protected Equipment(EquipmentType equipmentType, EquipmentState equipmentState, int powerConsumption){
        this.equipmentState = equipmentState;
        this.powerConsumption = powerConsumption;
        this.equipmentType = equipmentType;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public EquipmentState getEquipmentState() {
        return equipmentState;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        this.equipmentState = equipmentState;
    }
}
