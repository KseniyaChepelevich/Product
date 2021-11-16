package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductManager manager = new ProductManager();
    private Book coreJava = new Book();
    private Book coreJava2 = new Book(1, "Cora Java2", 566, "Гари Корнелл");

    private Smartphone Samsung = new Smartphone();

    @Test
    public void shouldSaveOneBook() {


        manager.add(coreJava2);

        Product[] expected = new Product[]{coreJava2};
        Product[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }



    @Test
    public void shouldSaveOneBookWithAllParameters() {
        manager.add(coreJava2);

        Product[] expected = new Product[]{coreJava2};
        Product[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }



    @Test
    void getAll() {
    }

    @Test
    void removeById() {
    }

    @Test
    void searchBy() {
    }
}