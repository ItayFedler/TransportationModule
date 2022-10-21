package businessLogic;

import java.util.LinkedList;
import java.util.List;

public class Trucks {

    List<Truck> trucks;

    public Trucks(){
        trucks = new LinkedList<>();
    }

    public Trucks(List<Truck> trucks) {
        this.trucks = trucks;
    }

    public List<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(List<Truck> trucks) {
        this.trucks = trucks;
    }

    public void addTruck(Truck truck){
        trucks.add(truck);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "trucks=" + trucks +
                '}';
    }
}
