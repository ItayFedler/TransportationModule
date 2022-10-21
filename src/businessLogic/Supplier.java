package businessLogic;

import java.util.List;

public class Supplier extends Site{
    public Supplier(String name, String address, List<ContactPerson> contactPersons, Region region) {
        super(name, address, contactPersons, region);
    }
}
