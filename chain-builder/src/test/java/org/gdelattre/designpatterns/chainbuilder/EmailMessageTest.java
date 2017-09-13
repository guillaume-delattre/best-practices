package org.gdelattre.designpatterns.chainbuilder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test EmailMessage class.
 */
public class EmailMessageTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testBuild() {
        // given / then
        final EmailMessage emailMessage = EmailMessage.builder()
                .from("sender@test.com")
                .to("receiver@test.com")
                .subject("hello")
                .content("Some content")
                .build();

        // then
        assertNotNull(emailMessage);
        assertEquals(emailMessage.getFrom(), "sender@test.com");
        assertEquals(emailMessage.getTo(), "receiver@test.com");
        assertEquals(emailMessage.getSubject(),"hello");
        assertEquals(emailMessage.getContent(), "Some content");
    }

    @Test
    public void testBuildWithNullValues() {
        // expected
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("From parameter cannot be null");

        // when
        EmailMessage.builder()
                .from(null)
                .to("receiver@test.com")
                .subject("hello")
                .content("Some content")
                .build();
    }

}
