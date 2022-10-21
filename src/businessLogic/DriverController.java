package businessLogic;

import java.util.LinkedList;
import java.util.List;

import static businessLogic.LicenseType.A;

public class DriverController {

    List<Driver> drivers;

    public DriverController(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public DriverController(String[] driversNames){
        drivers = new LinkedList<>();
        for (String name : driversNames){
            drivers.add(new Driver(name, "000-0000000", new LinkedList<LicenseType>()));
        }
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }
    public Driver getDriver(String driverName){
        for (Driver driver : drivers){
            if (driver.getName().equals(driverName))
                return driver;
        }
        throw new IllegalArgumentException("no such driver");
    }
}
