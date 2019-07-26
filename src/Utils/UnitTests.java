package Utils;

import Enums.SensorInpStates;
import NmAssets.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTests {
    private Hotel hotel;
    private IChangeFloorMovement iChangeFloorMovement;

    @Before
    public void instantiate(){
        hotel = new Hotel(2, 1, 2);
        iChangeFloorMovement = new ChangeInFloorMovement();
    }

    @Test
    public void movementTest(){
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
    }

    @Test
    public void noMovementTests(){
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
    }
}
