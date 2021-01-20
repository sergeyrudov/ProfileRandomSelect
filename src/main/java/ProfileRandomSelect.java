import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProfileRandomSelect {
    private static String locator = "Kievskaya Street";

    public static void main(String[] args) {


        for (int i = 0; i<result().size(); i ++) {
            System.out.println(result().get(i));
        }
    }

    public static List<Address> addressList() {
        Address adr1 = new Address("Mira", 22);
        Address adr2 = new Address("Gagarina", 15);
        Address adr3 = new Address("Wall Street", 933);
        Address adr4 = new Address("Lenina Street", 9443);
        Address adr5 = new Address("Abrikosovaya Street", 93233);
        Address adr6 = new Address("Kievskaya Street", 567);
        Address adr7 = new Address("Balzaka Street", 424);


        List<Address> addresses = new ArrayList<>();
        addresses.add(adr1);
        addresses.add(adr2);
        addresses.add(adr3);
        addresses.add(adr4);
        addresses.add(adr5);
        addresses.add(adr6);
        addresses.add(adr7);

        return addresses;
    }


    public static List<Address> result() {
        Random random = new Random();
        var randomAddressIndex = random.nextInt(addressList().size());

        List<Address> o = new ArrayList<>();
        for (int i = 0; i < addressList().size(); i++) {

            if (addressList().get(i).getStreet().equals(locator) ) {
                if (randomAddressIndex == i) {
                    return result();
                } else {
                    o.add(addressList().get(randomAddressIndex));
                }
                return o;
            }
        }
        return o;
    }
}


class Address {

    private String street;
    private int flat;

    public Address(String street, int flat) {
        this.street = street;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "street: " + street + " flat is: " + flat;
    }
}