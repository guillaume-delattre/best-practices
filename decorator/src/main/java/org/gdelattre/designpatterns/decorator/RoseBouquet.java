package org.gdelattre.designpatterns.decorator;

/**
 * Concrete classes that extends {@link FlowerBouquet} to represent objects to which additional
 * responsibilities can be attached.
 */
public class RoseBouquet extends FlowerBouquet{

    public RoseBouquet(){
        description = "Rose bouquet";
    }

    public  double cost(){
        return 12.0;
    }
}
