package Utils;

import Enums.SensorInpStates;
import NmAssets.Hotel;

public class TestMain {

    public static void main(String[] abcd){
        Hotel hotel = new Hotel(2,1,2);
        PrintResult printResult = new PrintResult();
        IChangeFloorMovement iChangeFloorMovement = new ChangeInFloorMovement();
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        System.out.println("After movement ");
        printResult.printResultHotel(hotel);
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        System.out.println("After No movement ");
        printResult.printResultHotel(hotel);

    }
}
