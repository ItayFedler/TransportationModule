package Service;

import businessLogic.DriverController;
import businessLogic.TransportController;

import java.util.Scanner;

public class TransportFormService {

    TransportController transportController;
    DriverController driverControllerl;
    Scanner scanner;
    Idgenarator idgenarator;

    public TransportFormService(Scanner scanner) {
        transportController = new TransportController();
        driverControllerl = new DriverController(new String[]{"jo","leo","pau"});
        scanner = scanner;
        idgenarator = new Idgenarator();
    }

    @Override
    public String toString() {
        return "TransportForm: " + this.hashCode();
    }

    public void createForm(){
        TransportForm transportForm = new TransportForm();
        transportForm.id = idgenarator.getId();
        transportForm.date = askInput("enter the transport date . for example 02/05/2022 ");
        transportForm.departureTime = askInput("enter the departure time. for example 13:20 ");
        transportForm.driver = driverControllerl.getDriver(askInput("choose the transport driver from your drivers crew: " + driverControllerl.getDrivers().toString() ));
        //transportForm.truck????
        transportController.createForm(transportForm);
    }

    public void updateForm(){

    }


    /**
     * @param question that the user will gonna asked to answer
     * @return the answer of the user as a string
     */
    private String askInput(String question){
        System.out.println(question);
        String answer = scanner.next();
        return answer;
    }

}
