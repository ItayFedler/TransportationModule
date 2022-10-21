package Service;

import businessLogic.Driver;
import businessLogic.Site;

import java.util.List;

public class TransportForm {

    String id;
    String date;
    String departureTime;
    Driver driver;
    Site source;
    List<Site> destinations;

    public TransportForm() {
    }

    public void setId(String id, Idgenarator idgenarator) {
        this.id = id;
        this.date = date;
        this.departureTime = departureTime;
        this.driver = driver;
        this.source = source;
        this.destinations = destinations;
    }
}
