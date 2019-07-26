package NmAssets;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Floor {
    private int floorId;

    private HashMap<Integer, MainCorridor> mainCorridorHashMap;
    private HashMap<Integer, SubCorridor> subCorridorHashMap;
//    private int powerConsumptionLimitPerfloor;


    public Floor(int floorId, Integer numberOfMainCorridor, Integer numberOfSubCorridors) {
        this.floorId = floorId;
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

//    public int getPowerConsumptionLimitPerfloor() {
//        return powerConsumptionLimitPerfloor;
//    }
}
