public class Address {
    public String street;
    public String city;
    public String governorate;
    public String postCode;
    public Address(String street, String city, String governorate, String postCode) {
        this.street = street;
        this.city = city;
        this.governorate = governorate;
        this.postCode = postCode;
    }
    public Address() {
        this.street = "None specified";
        this.city = "None specified";
        this.governorate = "None specified";
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getGovernorate() {
        return governorate;
    }
    public void setGovernorate(String governorate) {
        this.governorate = governorate;
    }
    public String getPostCode() {
        return postCode;
    }
}
