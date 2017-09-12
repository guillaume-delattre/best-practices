package org.gdelattre.designpatterns.decorator;

/**
 * ConcreteDecorator, concrete classes that extends Decorator to decorate Components with responsibilities.
 */
public class RibbonBow extends FlowerBouquetDecorator{

    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    public  String getDescription(){
        return flowerBouquet.getDescription() + ", ribbon bow";
    }

    public double cost()
    {
        return 6.5 + flowerBouquet.cost();
    }
}
