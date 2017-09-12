package org.gdelattre.designpatterns.decorator;

/**
 * "Component", abstract base class that can be decorated with responsibilities dynamically.
 */
public abstract class FlowerBouquet {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
