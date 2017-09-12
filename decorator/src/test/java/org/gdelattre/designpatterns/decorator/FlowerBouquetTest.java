package org.gdelattre.designpatterns.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlowerBouquetTest {
    @Test
    public void testFlowerBouquet() {
        /*Rose bouquet with no decoration*/
        FlowerBouquet roseBouquet = new RoseBouquet();
        assertEquals("Rose bouquet", roseBouquet.getDescription());
        assertEquals(12.0, roseBouquet.cost(), 0);

         /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        assertEquals("Rose bouquet, paper wrap, ribbon bow, glitter", decoratedRoseBouquet.getDescription());

         /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);

        assertEquals("Orchid bouquet, paper wrap, paper wrap, ribbon bow", decoratedOrchidBouquet.getDescription());
    }
}
