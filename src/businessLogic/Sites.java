package businessLogic;

import java.util.Dictionary;
import java.util.List;

public class Sites {

    List<Site> sites;

    public Sites(){
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Dictionary<Region, List<Site>> getByRegion(){
     return null;
    }

    @Override
    public String toString() {
        return "TransportSystemSites{" +
                "sites=" + sites +
                '}';
    }
}