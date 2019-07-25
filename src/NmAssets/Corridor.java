package NmAssets;

import Enums.CorridorType;

public class Corridor {
    protected int corridorId;
    protected CorridorType corridorType;

    Corridor(int corridorId, CorridorType corridorType){
        this.corridorId = corridorId;
        this.corridorType = corridorType;
    }

    public int getCorridorId() {
        return corridorId;
    }
}
