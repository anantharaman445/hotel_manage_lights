package Utils;

import Enums.SensorInpStates;
import NmAssets.Hotel;

public class TestMain {

    public static void main(String[] abcd){
        Hotel hotel = new Hotel(2,1,2);
        IChangeFloorMovement iChangeFloorMovement = new ChangeInFloorMovement();
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 1, SensorInpStates.MOVEMENT);
        System.out.print(hotel.getFloorHashMap().get(1).getFloorId());
    }
}
