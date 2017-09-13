package org.gdelattre.designpatterns.factory;

import java.util.Objects;

/**
 * A Mercedes implementation.
 */
public class Mercedes implements Car {
    private final String brandName;

    public Mercedes() {
        this.brandName = "Mercedes";
    }

    @Override
    public String accelerate() {
        return "Mercedes vroom !";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brandName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Mercedes)) {
            return false;
        }

        Mercedes mercedes = (Mercedes) obj;

        return Objects.equals(brandName, mercedes.brandName);
    }

    public String getBrandName() {
        return brandName;
    }
}
