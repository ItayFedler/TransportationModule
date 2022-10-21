package businessLogic;

import java.util.List;

public class Driver {

    String name;
    String phoneNumber;
    List<LicenseType> licenseTypes;


    public Driver(String name, String phoneNumber, List<LicenseType> licenseTypes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licenseTypes = licenseTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<LicenseType> getLicenseTypes() {
        return licenseTypes;
    }

    public void setLicenseTypes(List<LicenseType> licenseTypes) {
        this.licenseTypes = licenseTypes;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseTypes=" + licenseTypes +
                '}';
    }
}
