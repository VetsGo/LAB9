package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlatziFakeStoreAPITest {

    @Test
    void getResponse() throws Exception {
        PlatziFakeStoreAPI fakeStoreAPI = spy(new PlatziFakeStoreAPI());
        doReturn("[]").when(fakeStoreAPI).getResponse(anyString());

        String response = fakeStoreAPI.getResponse("https://api.escuelajs.co/api/v1/categories");
        assertEquals("[]", response);
    }

    @Test
    void getProducts() throws Exception {
        PlatziFakeStoreAPI fakeStoreAPI = spy(new PlatziFakeStoreAPI());
        doReturn("[]").when(fakeStoreAPI).getResponse(anyString());

        List<Products> products = fakeStoreAPI.getProducts();
        assertEquals(0, products.size());
    }

    @Test
    void getCategories() throws Exception {
        PlatziFakeStoreAPI fakeStoreAPI = spy(new PlatziFakeStoreAPI());
        doReturn("[]").when(fakeStoreAPI).getResponse(anyString());

        List<Categories> categories = fakeStoreAPI.getCategories();
        assertEquals(0, categories.size());
    }

    @Test
    void getUsers() throws Exception {
        PlatziFakeStoreAPI fakeStoreAPI = spy(new PlatziFakeStoreAPI());
        doReturn("[]").when(fakeStoreAPI).getResponse(anyString());

        List<Users> users = fakeStoreAPI.getUsers();
        assertEquals(0, users.size());
    }
}