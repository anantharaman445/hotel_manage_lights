package NmAssets;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Floor> floors;

    Hotel(int noOfFloors, int noOfMainCorridors, int noOfSubCoridors){
       floors = new ArrayList<>(noOfFloors);
       for(int i=1; i<= noOfFloors; i++){
           Floor floor = new Floor(noOfMainCorridors, noOfSubCoridors);
           floors.add(floor);
       }
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
