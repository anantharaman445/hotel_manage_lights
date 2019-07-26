package Utils;

import Enums.SensorInpStates;
import NmAssets.Hotel;

public class TestMain {

    public static void main(String[] abcd){
        Hotel hotel = new Hotel(2,1,2);
        IChangeFloorMovement iChangeFloorMovement = new ChangeInFloorMovement();
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        System.out.print(hotel.getFloorHashMap().get(1).getFloorId());

        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        System.out.print(hotel.getFloorHashMap().get(1).getFloorId());
    }
}
