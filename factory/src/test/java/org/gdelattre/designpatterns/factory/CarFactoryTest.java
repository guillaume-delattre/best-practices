package org.gdelattre.designpatterns.factory;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Test CarFactory class.
 */
public class CarFactoryTest {

    private final CarFactory factory = new CarFactory();

    @Test
    public void testCreateAudi() {
        Car audi = new Audi();

        assertEquals(audi, factory.createAudi());
        assertThat(audi, CoreMatchers.instanceOf(Audi.class));
    }

    @Test
    public void testCreateMercedes() {
        Car mercedes = new Mercedes();

        assertEquals(mercedes, factory.createMercedes());
        assertThat(mercedes, CoreMatchers.instanceOf(Mercedes.class));
    }
}
