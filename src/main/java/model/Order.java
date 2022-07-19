package model;

import com.beust.jcommander.Parameters;

public class Order {
    private String button;
    private String name;
    private String surname;
    private String address;
    private String metroStation;
    private String phoneNumber;

    public Order(String button, String name, String surname, String address, String metroStation, String phoneNumber) {
        this.button = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAddress(){
        return address;
    }

    public String getMetroStation(){
        return metroStation;
    }

    public String getOrderButton(){
        return button;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public static Order getDefaultOrder(){
        return new Order ("button", "name", "surname", "address", "metroStation", "phoneNumber");
    }
}

