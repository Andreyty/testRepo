
public abstract class PassengerAircraft extends Aircraft{
    private int aircraftLoad;
    private int aircraftSeats;

    public PassengerAircraft(String aircraftManufacturer, String aircraftModel, int flightDistance, int aircraftLoad, int aircraftSeats){
        super(aircraftManufacturer, aircraftModel, flightDistance);
        this.aircraftLoad=aircraftLoad;
        this.aircraftLoad=aircraftSeats;
    }
    @Override
    public int getAircraftLoad(){
        return aircraftLoad;
    }
    @Override
    public int getAircraftSeats(){
        return aircraftSeats;
    }

}
