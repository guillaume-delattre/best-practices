package org.gdelattre.designpatterns.factory;

import java.util.Objects;

/**
 * A org.gdelattre.designpatterns.factory.Car implementation.
 */
public class Audi implements Car {

    private final String brandName;

    public Audi() {
        this.brandName = "Audi";
    }

    @Override
    public String accelerate() {
        return "Audi vroom !";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brandName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Audi)) {
            return false;
        }

        Audi audi = (Audi) obj;

        return Objects.equals(brandName, audi.brandName);
    }

    public String getBrandName() {
        return brandName;
    }
}
