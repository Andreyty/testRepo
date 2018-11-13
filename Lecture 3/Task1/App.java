public class App {
    public static void main(String[] args){
        Aircraft aircraftAirbusA320 = new AircraftAirbusA320();
        Aircraft aircraftTupolevTu144 = new AircraftTupolevTu144();
        Aircraft aircraftTupolevTu154 = new AircraftTupolevTu154();
        Aircraft aircraftAntonovAn2 = new AircraftAntonovAn2();
        Aircraft aircraftAntonovAn124 = new AircraftAntonovAn124();
        Aircraft aircraftIlyushinIl76 = new AircraftIlyushinIl76();

        AirCompany valkiria = new AirCompany("Night Witches");
        valkiria.addAircraft(aircraftAirbusA320);
        valkiria.addAircraft(aircraftAntonovAn2);
        valkiria.addAircraft(aircraftAntonovAn124);
        valkiria.addAircraft(aircraftIlyushinIl76);
        valkiria.addAircraft(aircraftTupolevTu144);
        valkiria.addAircraft(aircraftTupolevTu154);

        valkiria.showCompanyAircrafts();

        System.out.println( );
        System.out.println("Aircrafts sorted by flight distance: ");
        valkiria.sortAircraftsByRange();
        valkiria.showCompanyAircrafts();
        System.out.println( );
        valkiria.showTotalCapacity();
    }
}
