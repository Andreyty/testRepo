
import java.util.Comparator;

public class AircraftCompare implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft a1, Aircraft a2) {
        return new Integer(a1.getFlightDistance()).compareTo(a2.getFlightDistance());
    }

}