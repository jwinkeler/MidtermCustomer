package application;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


public class Customer {

    private final StringProperty FirstName;
    private final StringProperty MiddleInit;
    private final StringProperty LastName;
    private final StringProperty Gender;
    private final StringProperty Address;
    private final StringProperty City;
    private final StringProperty St;
    private final StringProperty Zip;

 
   

 
    public Customer(String FirstName,String MiddleInit, String LastName) {
        this.FirstName = new SimpleStringProperty(FirstName);
        this.LastName = new SimpleStringProperty(LastName);
        this.MiddleInit = new SimpleStringProperty(MiddleInit);
        this.Zip = new SimpleStringProperty("");
        this.Gender = new SimpleStringProperty("");
        this.Address = new SimpleStringProperty("");
        this.City = new SimpleStringProperty("");
        		
        }

    

    public Customer() {

	}



	public String getFirstName() {
        return FirstName.get();
    }

    public void setFirstName(String firstName) {
        this.FirstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return FirstName;
    }
    public String getMiddleInit() {
        return MiddleInit.get();
    }


    public void setMiddleInit(String MiddleInit) {
        this.MiddleInit.set(MiddleInit);
    }

    public StringProperty MiddleInitProperty() {
        return MiddleInit;
        }
    
    public String getLastName() {
        return LastName.get();
    }

    public void setLastName(String lastName) {
        this.LastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return LastName;
    }


    public String getPostalCode() {
        return Zip.get();
    }

    public void setPostalCode(String postalCode) {
        this.Zip.set(postalCode);
    }

    public StringProperty postalCodeProperty() {
        return Zip;
    }

    public String getCity() {
        return City.get();
    }

    public void setCity(String city) {
        this.City.set(city);
    }

    public StringProperty cityProperty() {
        return City;
    }
    public String getAddress() {
        return Address.get();
    }

    public void setAddress(String Address) {
        this.Address.set(Address);
    }

    public StringProperty AddressProperty() {
        return Address;
    }

}