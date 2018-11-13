import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AirCompany {
    private String companyName;
    private List<Aircraft> aircrafts = new ArrayList<Aircraft>();

    public AirCompany(String companyName){
        this.companyName=companyName;
    }

    public String getAirCompanyName(){
        return companyName;
    }

    public void setAirCompanyName(String companyName){
        this.companyName=companyName;
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public void showTotalCapacity(){
        int totalPssengerCap=0;
        int totalLoadCap=0;
        for (int i =0; i<aircrafts.size(); i++){
            totalLoadCap += aircrafts.get(i).getAircraftLoad();
            totalPssengerCap += aircrafts.get(i).getAircraftSeats();
        }

        System.out.println("Total passenger capacity: "+ totalPssengerCap);
        System.out.println("Total load capacity: "+ totalLoadCap);
    }

    public void sortAircraftsByRange(){
        Collections.sort(this.aircrafts, new AircraftCompare());
    }

    public void showCompanyAircrafts(){
        showAircraftsList(this.aircrafts);
    }

    private void showAircraftsList(List<Aircraft> list){
        System.out.println("Company " +this.getAirCompanyName()+ " has Aircrafts: ");
        for (int i=0;i<list.size();++i){
            System.out.println(list.get(i));
        }
    }



}
