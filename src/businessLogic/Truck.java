package businessLogic;

public class Truck {

    int number;
    String licenseType;
    int licenseNumber;
    String model;
    int weight;
    int maxWeight;

    public Truck(int number, String licenseType, int licenseNumber, String model, int weight, int maxWeight) {
        this.number = number;
        this.licenseType = licenseType;
        this.licenseNumber = licenseNumber;
        this.model = model;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "number=" + number +
                ", licenseType='" + licenseType + '\'' +
                ", licenseNumber=" + licenseNumber +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
