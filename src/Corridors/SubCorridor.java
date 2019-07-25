package Corridors;

public class SubCorridor extends Corridor {

    private boolean lightsOn;


    public SubCorridor(){
        super();
        this.lightsOn = false;
    }

    public boolean getLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }


}
