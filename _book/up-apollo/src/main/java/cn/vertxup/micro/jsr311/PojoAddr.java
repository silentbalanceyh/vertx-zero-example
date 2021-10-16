package cn.vertxup.micro.jsr311;

import java.io.Serializable;

public class PojoAddr implements Serializable {

    private transient String country;
    private transient String state;
    private transient String city;
    private transient String address;

    public String getCountry() {
        return this.country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PojoAddr{" +
                "country='" + this.country + '\'' +
                ", state='" + this.state + '\'' +
                ", city='" + this.city + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}
