package Corridors;

public class Corridor {
    private int lights;
    private int airConditioners;
    private int powerConsumptionLight;
    private int powerConsumptionAC;
    private boolean dayTime;

    Corridor(){
        this.lights = 1;
        this.airConditioners = 1;
        this.powerConsumptionLight = 5;
        this.powerConsumptionAC = 10;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public int getAirConditioners() {
        return airConditioners;
    }

    public void setAirConditioners(int airConditioners) {
        this.airConditioners = airConditioners;
    }

    public int getPowerConsumptionLight() {
        return powerConsumptionLight;
    }

    public void setPowerConsumptionLight(int powerConsumptionLight) {
        this.powerConsumptionLight = powerConsumptionLight;
    }

    public int getPowerConsumptionAC() {
        return powerConsumptionAC;
    }

    public void setPowerConsumptionAC(int powerConsumptionAC) {
        this.powerConsumptionAC = powerConsumptionAC;
    }

    public boolean getIsDayTime() {
        return dayTime;
    }

    public void setIsDayTime(boolean dayTime) {
        this.dayTime = dayTime;
    }
}
