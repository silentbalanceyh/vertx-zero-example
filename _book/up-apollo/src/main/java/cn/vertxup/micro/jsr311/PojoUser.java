package cn.vertxup.micro.jsr311;

import java.io.Serializable;

public class PojoUser implements Serializable {

    private transient String username;
    private transient String email;
    private transient PojoAddr address;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public PojoAddr getAddress() {
        return this.address;
    }

    public void setAddress(final PojoAddr address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PojoUser{" +
                "username='" + this.username + '\'' +
                ", email='" + this.email + '\'' +
                ", address=" + this.address +
                '}';
    }
}
