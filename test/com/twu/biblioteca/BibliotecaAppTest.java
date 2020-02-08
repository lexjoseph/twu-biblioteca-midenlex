package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {



    @Test
    public void shouldCheckoutBook() {

        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();

        assertEquals(6, app.getAvailableBooks().size());

        app.checkoutBook();
        assertEquals(5, app.getAvailableBooks().size());
    }


}
