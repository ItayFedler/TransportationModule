package businessLogic;

import java.util.List;

public class TransportForm {

    String id;
    String date;
    String departureTime;
    Driver driver;
    Site source;
    List<Site> destinations;

    public TransportForm(String id, String date, String departureTime, Driver driver, Site source, List<Site> destinations) {
        this.id = id;
        this.date = date;
        this.departureTime = departureTime;
        this.driver = driver;
        this.source = source;
        this.destinations = destinations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Site getSource() {
        return source;
    }

    public void setSource(Site source) {
        this.source = source;
    }

    public List<Site> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Site> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "TransportForm{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", driver=" + driver +
                ", source=" + source +
                ", destinations=" + destinations +
                '}';
    }
}
