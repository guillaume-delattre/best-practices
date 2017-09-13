package org.gdelattre.designpatterns.factory;

/**
 * A Car Factory.
 */
public class CarFactory {

    public Audi createAudi() {
        return new Audi();
    }

    public Mercedes createMercedes() {
        return new Mercedes();
    }

}
