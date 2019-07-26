package NmAssets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    private HashMap<Integer, Floor> floorHashMap;

    public Hotel(int noOfFloors, int noOfMainCorridors, int noOfSubCoridors){
        floorHashMap = new HashMap<>(noOfFloors);
       for(int i=1; i<= noOfFloors; i++){
           Floor floor = new Floor(i, noOfMainCorridors, noOfSubCoridors);
           floorHashMap.put(i, floor);
       }
    }

    public HashMap<Integer, Floor> getFloorHashMap() {
        return floorHashMap;
    }
}
