package Utils;

import Enums.EquipmentState;
import Enums.SensorInpStates;
import Enums.TimeSlot;
import NmAssets.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTests {
    private Hotel hotel;
    private IChangeFloorMovement iChangeFloorMovement;
    private  ICheckFloorResults icheckFloorResults;
    private TimeSlot timeSlot;

    @Before
    public void instantiate(){
        int noOfFloors = 2;
        timeSlot = TimeSlot.NIGHT_TIME;
        int noOfMainCorridors = 1;
        int noOfSubCorridors = 2;
        hotel = new Hotel(noOfFloors, noOfMainCorridors, noOfSubCorridors);
        iChangeFloorMovement = new ChangeInFloorMovement();
        icheckFloorResults = new CheckFloorResults();
    }

    @Test
    public void movementTest(){
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.MOVEMENT);
        String floorLight = icheckFloorResults.checkSubCorridorLights(hotel.getFloorHashMap().get(1), 2);
        assertTrue(EquipmentState.ON.toString().equals(floorLight));
    }

    @Test
    public void noMovementTests(){
        iChangeFloorMovement.changeSubCorridorLightStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        iChangeFloorMovement.changeSubCorridorAirConditionerStatus(hotel.getFloorHashMap().get(1), 2, SensorInpStates.NO_MOVEMENT);
        String floorLight = icheckFloorResults.checkSubCorridorLights(hotel.getFloorHashMap().get(1), 2);
        assertTrue(EquipmentState.OFF.toString().equals(floorLight));
    }
}
