import Floor.Floor;
import Hotel.Hotel;

public class MainTest {

    public static void main(String[] args){
        Floor floor = new Floor(1,1);
        System.out.println(floor.getMainCorridors().size());
//        Hotel hotel = new Hotel(1);
    }
}
