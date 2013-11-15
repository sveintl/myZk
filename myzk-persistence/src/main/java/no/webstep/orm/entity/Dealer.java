package no.webstep.orm.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: stlandsverk
 * Date: 14.11.13
 * Time: 21:48
 */
@Entity
public class Dealer implements Serializable {
    private static final long serialVersionUID = 3300190874468381045L;

    private Integer id;
    private String name;
    private String email;
    private String address;
    private BigDecimal lng;
    private BigDecimal lat;

    @Id
    public int getId() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "LNG", columnDefinition="decimal", precision=8, scale=6)
    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    @Column(name = "LAT", columnDefinition="decimal", precision=8, scale=6)
    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getName()).append("-");
        builder.append("   id=").append(id);
        builder.append("   name=").append(name);
        builder.append("   email=").append(email);
        builder.append("   address=").append(address);
        builder.append("   lng=").append(lng);
        builder.append("   lat=").append(lat);

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        return prime * result + (id == null ? 0 : id.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dealer other = (Dealer) obj;

        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }

        return true;

    }
}
