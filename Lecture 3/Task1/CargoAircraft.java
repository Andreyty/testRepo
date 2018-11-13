

public abstract class CargoAircraft extends Aircraft {
    private int aircraftLoad;

    public CargoAircraft(String aircraftManufacturer, String aircraftModel, int flightDistance, int aircraftLoad){
        super(aircraftManufacturer, aircraftModel, flightDistance);
        this.aircraftLoad=aircraftLoad;
    }
    @Override
    public int getAircraftLoad(){
        return aircraftLoad;
    }
    @Override
    public int getAircraftSeats(){
        return 0;
    }

}
