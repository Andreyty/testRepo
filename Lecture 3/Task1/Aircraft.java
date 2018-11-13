
public abstract class Aircraft {
    private String aircraftManufacturer;
    private String aircraftModel;
    private int flightDistance;

    public Aircraft(String aircraftManufacturer, String aircraftModel, int flightDistance){
        this.aircraftManufacturer = aircraftManufacturer;
        this.aircraftModel = aircraftModel;
        this.flightDistance = flightDistance;
    }

    public abstract int getAircraftSeats();
    public abstract int getAircraftLoad();

    public int getFlightDistance(){
        return flightDistance;
    }

    public String getAircraftManufacturer(){
        return aircraftManufacturer;
    }

    public String getAircraftModel(){
        return aircraftModel;
    }

    @Override
    public String toString(){
        return "Aircraft [aircraftManufacturer=" + aircraftManufacturer+ ", aircraftModel="+aircraftModel+", aircraftSeats="+getAircraftSeats()
                +", aircraftLoad="+getAircraftLoad()+", flightDistance="+flightDistance+"]";
    }
}
