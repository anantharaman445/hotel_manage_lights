package Floor;

import Corridors.MainCorridor;
import Corridors.SubCorridor;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private List<MainCorridor> mainCorridors;
    private List<SubCorridor> subCorridors;

    public Floor(int mainCorr, int subCorr){
        mainCorridors = new ArrayList<MainCorridor>();
        subCorridors = new ArrayList<SubCorridor>();

        for(int i=0; i<mainCorr; i++){
            mainCorridors.add(new MainCorridor());
        }

        for(int i=0;i<subCorr;i++){
            subCorridors.add(new SubCorridor());
        }

    }

    public List<MainCorridor> getMainCorridors() {
        return mainCorridors;
    }

    public List<SubCorridor> getSubCorridors() {
        return subCorridors;
    }

}