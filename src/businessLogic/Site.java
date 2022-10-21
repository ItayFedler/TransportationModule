package businessLogic;

import java.util.List;

enum Region {
}

abstract public class Site {
    public String name;
    public String address;
    public List<ContactPerson> contactPersons;
    public Region region;

    public Site(String name, String address, List<ContactPerson> contactPersons, Region region ){
        name = name;
        address = address;
        contactPersons = contactPersons;
        region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ContactPerson> getContactPersons() {
        return contactPersons;
    }

    public void setContactPersons(List<ContactPerson> contactPersons) {
        this.contactPersons = contactPersons;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Site{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactPersons=" + contactPersons +
                ", region=" + region +
                '}';
    }
}

