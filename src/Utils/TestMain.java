package Utils;

import NmAssets.Hotel;

public class TestMain {

    public static void main(String[] abcd){
        Hotel hotel = new Hotel(2,1,2);
        System.out.print(hotel.getFloors().get(1).getFloorId());
    }
}
