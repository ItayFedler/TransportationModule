package businessLogic;

import java.util.List;

public class Branch extends Site {

    public Branch(String name, String address, List<ContactPerson> contactPersons, Region region) {
        super(name, address, contactPersons, region);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactPersons=" + contactPersons +
                ", region=" + region +
                '}';
    }
}
