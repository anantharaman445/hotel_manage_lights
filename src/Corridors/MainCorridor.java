package Corridors;

public class MainCorridor extends Corridor {

    private boolean lightsOn;
    private  boolean acTurnedon;


    public MainCorridor(){
        super();
        this.lightsOn = false;
        this.acTurnedon = true;
    }

    public boolean getLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public boolean getIsAcTurnedon() {
        return acTurnedon;
    }

    public void setIsAcTurnedon(boolean acTurnedon) {
        this.acTurnedon = acTurnedon;
    }

}
