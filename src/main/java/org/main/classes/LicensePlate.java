package org.main.classes;

import java.util.Objects;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LicensePlate other = (LicensePlate) obj;
        return Objects.equals(this.country, other.country) &&
               Objects.equals(this.liNumber, other.liNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.country, this.liNumber);
    }
}
