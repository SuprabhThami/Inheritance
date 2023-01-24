package model;

public class Parent {
    String House_address ;
    String Family_name;

    public String getHouse_address() {
        return House_address;
    }

    public void setHouse_address(String house_address) {
        House_address = house_address;
    }

    public String getFamily_name() {
        return Family_name;
    }

    public void setFamily_name(String family_name) {
        Family_name = family_name;
    }

    public Parent(String house_address, String family_name) {
        House_address = house_address;
        Family_name = family_name;
    }
}
