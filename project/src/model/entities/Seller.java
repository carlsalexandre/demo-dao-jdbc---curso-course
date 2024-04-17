package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private Date birthDay;
    private Double baseSalay;

    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, Date birthDay, Double baseSalay, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.baseSalay = baseSalay;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Double getBaseSalay() {
        return baseSalay;
    }

    public void setBaseSalay(Double baseSalay) {
        this.baseSalay = baseSalay;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", birthDay = " + birthDay +
                ", baseSalay = " + baseSalay +
                ", department = " + department +
                '}';
    }
}
