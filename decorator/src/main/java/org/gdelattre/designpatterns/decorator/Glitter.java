package org.gdelattre.designpatterns.decorator;

/**
 * ConcreteDecorator, concrete classes that extends Decorator to decorate Components with responsibilities.
 */
public class Glitter extends FlowerBouquetDecorator{

    FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    public  String getDescription(){
        return flowerBouquet.getDescription() + ", glitter";
    }

    public double cost()
    {
        return 4 + flowerBouquet.cost();
    }
}
