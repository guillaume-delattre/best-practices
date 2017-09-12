package org.gdelattre.designpatterns.decorator;

/**
 * Decorator (FlowerBouquetDecorator), an abstract class that extends Component
 * and acts as the base class for concrete decorator classes
 */
public abstract class FlowerBouquetDecorator extends FlowerBouquet {

    public abstract String getDescription();

}
