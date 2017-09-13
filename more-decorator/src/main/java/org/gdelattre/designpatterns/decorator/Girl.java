package org.gdelattre.designpatterns.decorator;

/**
 * Girl is the abstract class at the top level, we have girls from
 * different countries. With a GirlDecorator class, we can decorator
 * each girl with any feature by adding a new decorator.
 */
public abstract class Girl {
    String description = "no particular";

    public String getDescription(){
        return description;
    }
}
