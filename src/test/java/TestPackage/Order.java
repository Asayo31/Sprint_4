package TestPackage;

import com.beust.jcommander.Parameters;

public class Order {
    private final String button;
    private String name;
    private String surname;
    private String address;
    private String metroStation;
    private String phoneNumber;

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

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public Order (String button, String name, String surname, String address, String phoneNumber){
        this.button = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Parameters
    public static Object[] [] scooterOrderData(){
        return new Object[][] {
                {"Up", "Ана", "Че", "Москва Королева 15", "79998887766"},
                {"Bottom", "Тест", "Тестов", "Казань Баумана 3", "79008007060"}
        };
    }

    public static Order getDefaultOrder(){
        return new Order ("name", "surname", "address", "metroStation", "phoneNumber");
    }
}

