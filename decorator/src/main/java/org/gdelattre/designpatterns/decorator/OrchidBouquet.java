package org.gdelattre.designpatterns.decorator;

/**
 * Concrete classes that extends {@link FlowerBouquet} to represent objects to which additional
 * responsibilities can be attached.
 */
public class OrchidBouquet extends FlowerBouquet{

    public OrchidBouquet(){
        description = "Orchid bouquet";
    }

    public  double cost(){
        return 29.0;
    }
}
