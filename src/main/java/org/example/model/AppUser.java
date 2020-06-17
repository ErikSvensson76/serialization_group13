package org.example.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class AppUser implements Serializable {

    private String userId;
    private String name;
    private String email;
    private Address address;
    private String password;

    public AppUser(String name, String email, Address address, String password) {
        userId = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    AppUser() {
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getUserId(), appUser.getUserId()) &&
                Objects.equals(getName(), appUser.getName()) &&
                Objects.equals(getEmail(), appUser.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getEmail());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
