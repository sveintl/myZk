package no.toyota.domain;

/**
 * Created with IntelliJ IDEA.
 * User: stlandsverk
 * Date: 05.11.13
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */
public class Dealer {

    private String name;
    private String address;
    private String epost;
    private double longitude;
    private double latitude;

    public Dealer () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
