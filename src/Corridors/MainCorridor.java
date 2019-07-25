package Corridors;

public class MainCorridor extends Corridor {

    private boolean lightsOn;

    public MainCorridor(){
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
