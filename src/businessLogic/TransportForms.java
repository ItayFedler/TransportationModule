package businessLogic;

import java.util.LinkedList;
import java.util.List;

public class TransportForms {

    List<TransportForm> transportForms;

    public TransportForms(){ transportForms = new LinkedList<>();
    }

    public TransportForms(List<TransportForm> transportForms) {
        this.transportForms = transportForms;
    }

    public List<TransportForm> getTransportForms() {
        return transportForms;
    }

    public void setTransportForms(List<TransportForm> transportForms) {
        this.transportForms = transportForms;
    }

    @Override
    public String toString() {
        return "TransoprtFormDatabase{" +
                "transportForms=" + transportForms +
                '}';
    }
}
