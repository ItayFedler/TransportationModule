package businessLogic;

import java.util.Dictionary;

public class TransportProductsDocument {

    String id;
    Site destination;
    Dictionary<String,Integer> products;

    public TransportProductsDocument(String id, Site destination, Dictionary<String, Integer> products){
        id = id;
        destination = destination;
        products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Site getDestination() {
        return destination;
    }

    public void setDestination(Site destination) {
        this.destination = destination;
    }

    public Dictionary<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Dictionary<String, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "TransportProductsDocument{" +
                "id='" + id + '\'' +
                ", destination=" + destination +
                ", products=" + products +
                '}';
    }
}
