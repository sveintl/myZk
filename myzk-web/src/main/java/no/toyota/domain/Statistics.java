package no.toyota.domain;

/**
 * User: stlandsverk
 * Date: 07.11.13
 * Time: 10:54
 */
public class Statistics {
    private CarType carType;
    private int numSold;

    public Statistics(CarType carType, int numSold) {
        this.carType = carType;
        this.numSold = numSold;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumSold() {
        return numSold;
    }

    public void setNumSold(int numSold) {
        this.numSold = numSold;
    }
}
