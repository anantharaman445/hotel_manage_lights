package Hotel;

import Floor.Floor;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
   private List<Floor> floors;

   public Hotel(int noOfFloors){
       floors = new ArrayList<Floor>();
       for(int i=0; i<noOfFloors;i++){

       }

   }

    public List<Floor> getFloors() {
        return floors;
    }
}
