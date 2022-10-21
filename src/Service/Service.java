package Service;

import java.util.Scanner;

class Idgenarator {

    int IntId = 1;

    public String getId(){
        String nextId = ""+IntId+"" ;
        IntId++;
        return nextId;
    }
}

public class Service {

    Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


    /**
     * serves using scanner
     * @param scanner
     */
    public void Serve(Scanner scanner){
        setScanner(scanner);

        TransportFormService transportForm = new TransportFormService(scanner);
        SiteService siteService = new SiteService(scanner);
        TruckService truckService = new TruckService(scanner);

        System.out.println("please enter your name and press enter");
        String userName = scanner.nextLine();

//        System.out.println();
//        String action = scanner.next();
//        System.out.println("for " + action + ", follow the next instructions:");

        String action = askInput("hello " + userName + ", please choose action from the following options and press enter: "
                + "create form , update form , add site , update site , add truck , update truck");
    while(true){
        switch (action) {
            case "create form": {
                transportForm.createForm();
            }
            case "update form": {
                transportForm.updateForm();
            }
            case "add site": {
                break;
            }
            case "update site": {
                break;
            }
            case "add truck": {
                break;
            }
            case "update truck": {
                break;
            }
        }

        }
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
