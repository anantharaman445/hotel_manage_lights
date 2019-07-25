package NmAssets;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorId;
    private List<MainCorridor> mainCorridors;
    private  List<SubCorridor> subCorridors;
    private int powerConsumptionLimitPerfloor;

    Floor(int floorId, List<MainCorridor> mainCorridors, List<SubCorridor> subCorridors, int powerConsumptionLimitPerfloor){
        this.floorId = floorId;
        this.mainCorridors = mainCorridors;
        this.subCorridors = subCorridors;
        this.powerConsumptionLimitPerfloor = powerConsumptionLimitPerfloor;
    }

    public Floor(Integer numberOfMainCorridor, Integer numberOfSubCorridors) {

        mainCorridors = new ArrayList<>(numberOfMainCorridor);
        for (Integer i = 1; i <= numberOfMainCorridor; i++) {
            MainCorridor mainCorridor = new MainCorridor(i);
            mainCorridors.add(mainCorridor);
        }

        subCorridors = new ArrayList<>(numberOfSubCorridors);
        for (Integer i = 1; i <= numberOfSubCorridors; i++) {
            SubCorridor subCorridor = new SubCorridor(i);
            subCorridors.add(subCorridor);
        }

    }

    public int getFloorId() {
        return floorId;
    }

    public List<MainCorridor> getMainCorridors() {
        return mainCorridors;
    }

    public List<SubCorridor> getSubCorridors() {
        return subCorridors;
    }

    public int getPowerConsumptionLimitPerfloor() {
        return powerConsumptionLimitPerfloor;
    }
}
