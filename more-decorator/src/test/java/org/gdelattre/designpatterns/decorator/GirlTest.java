package org.gdelattre.designpatterns.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test girl decorator pattern implementation.
 */
public class GirlTest {

    @Test
    public void testAmericanGirl() {
        // given
        final Girl americanGirl = new AmericanGirl();

        // when
        final String description = americanGirl.getDescription();

        // then
        assertEquals("I am American", description);
    }

    @Test
    public void testArtisticGirl() {
        // given
        final Girl artisticGirl = new ArtisticGirl(new EuropeanGirl());

        // when
        final String description = artisticGirl.getDescription();

        // then
        assertEquals("I am European, likes Art", description);
        assertEquals("draw pictures!", ((ArtisticGirl)artisticGirl).draw());
    }
}
