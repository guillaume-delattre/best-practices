package org.gdelattre.designpatterns.decorator;

/**
 * An artistic girl.
 */
public class ArtisticGirl extends GirlDecorator {

    private Girl girl;

    public ArtisticGirl(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + ", likes Art";
    }

    public String draw() {
        return "draw pictures!";
    }
}
