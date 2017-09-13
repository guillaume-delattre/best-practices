package org.gdelattre.designpatterns.decorator;

/**
 * A concrete scientific girl.
 */
public class ScientificGirl extends GirlDecorator {

    private Girl girl;

    public ScientificGirl(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + ", likes Science";
    }

    public String caltulate() {
        return "scientific calculation!";
    }
}
