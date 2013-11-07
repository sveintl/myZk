package no.toyota.domain;

/**
 * User: stlandsverk
 * Date: 07.11.13
 * Time: 10:52
 */
public enum CarType {
    Statsjonsvogn("Statsjonsvogn"),
    Personbil("Personbil"),
    SUV("SUV"),
    Sportsbil("Sportsbil"),
    Elbil("Elbil");

    private String type;

    CarType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
