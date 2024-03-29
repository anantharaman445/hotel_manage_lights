package NmAssets;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Floor {
    private int floorId;

    private HashMap<Integer, MainCorridor> mainCorridorHashMap;
    private HashMap<Integer, SubCorridor> subCorridorHashMap;
    private float powerConsumptionLimitPerfloor;
    private float totalPowerConsumed;


    public Floor(int floorId, Integer numberOfMainCorridor, Integer numberOfSubCorridors) {
        this.floorId = floorId;
        this.powerConsumptionLimitPerfloor = numberOfMainCorridor*15 + numberOfSubCorridors*10;

        mainCorridorHashMap = new HashMap<>(numberOfMainCorridor);
        for (Integer i = 1; i <= numberOfMainCorridor; i++) {
            MainCorridor mainCorridor = new MainCorridor(i);
            mainCorridorHashMap.put(i,mainCorridor);
        }

        subCorridorHashMap = new HashMap<>(numberOfSubCorridors);
        for (Integer i = 1; i <= numberOfSubCorridors; i++) {
            SubCorridor subCorridor = new SubCorridor(i);
            subCorridorHashMap.put(i, subCorridor);
        }

    }

    public int getFloorId() {
        return floorId;
    }

    public HashMap<Integer, MainCorridor> getMainCorridorHashMap() {
        return mainCorridorHashMap;
    }

    public HashMap<Integer, SubCorridor> getSubCorridorHashMap() {
        return subCorridorHashMap;
    }

    public float getPowerConsumptionLimitPerfloor() {
        return powerConsumptionLimitPerfloor;
    }

    public float getTotalPowerConsumed() {
        return totalPowerConsumed;
    }

    public void setTotalPowerConsumed(float totalPowerConsumed) {
        this.totalPowerConsumed = totalPowerConsumed;
    }
}
