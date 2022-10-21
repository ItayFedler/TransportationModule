package businessLogic;

import java.util.List;

public class TransportController {

    TransportForms transportForms;

    public TransportController() {
        transportForms = new TransportForms();
    }

    public List<TransportForm> getTransportFormList(){
        return transportForms.getTransportForms();
    }

    public void createForm(Service.TransportForm transportForm){

    }
}
