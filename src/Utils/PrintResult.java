package Utils;

import NmAssets.Floor;
import NmAssets.Hotel;
import NmAssets.MainCorridor;
import NmAssets.SubCorridor;

import java.util.Iterator;
import java.util.Map;

public class PrintResult {

    public void printResultHotel(Hotel hotel) {
        for (int i = 1; i <= hotel.getFloorHashMap().size(); i++) {
            Floor floor = hotel.getFloorHashMap().get(i);

            System.out.println("FLoor No: " + floor.getFloorId());
            System.out.println("Power Consumption allowed :" + " " + floor.getPowerConsumptionLimitPerfloor());

            Iterator<Map.Entry<Integer, MainCorridor>> mainCorridorItr = floor.getMainCorridorHashMap().entrySet().iterator();
            while (mainCorridorItr.hasNext()) {
                Map.Entry<Integer, MainCorridor> entry = mainCorridorItr.next();
                System.out.println(entry.getValue().getCorridorType() + "-" + entry.getValue().getCorridorId());
                System.out.println("Light :  " + entry.getValue().getLight().getEquipmentState().toString());
                System.out.println("Air Conditioner :" + entry.getValue().getAirConditioner().getEquipmentState().toString());
            }

            Iterator<Map.Entry<Integer, SubCorridor>> subCorridorItr = floor.getSubCorridorHashMap().entrySet().iterator();
            while (subCorridorItr.hasNext()) {
                Map.Entry<Integer, SubCorridor> entry = subCorridorItr.next();
                System.out.println(entry.getValue().getCorridorType() + "-" + entry.getValue().getCorridorId());
                System.out.println("Light :  " + entry.getValue().getLight().getEquipmentState().toString());
                System.out.println("Air Conditioner :" + entry.getValue().getAirConditioner().getEquipmentState().toString());
            }
        }
    }
}
