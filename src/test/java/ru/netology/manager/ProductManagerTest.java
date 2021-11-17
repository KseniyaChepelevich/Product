package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductManager manager = new ProductManager();


    //private Book coreJava = new Book();
    private Book coreJava2 = new Book(1, "Cora Java2", 566, "Гари Корнелл");
    private Book java3 = new Book(3, "Java3", 750, "Jason");
    private Book java5 = new Book(4, "Java5", 750, "Jason");
    private Book many = new Book(5, "Many", 350, "Ivanov");

    //private Smartphone Samsung = new Smartphone(7, "Galaxy S21", 55150, "Samsung" );

    @Test
    public void shouldSaveOneBook() {


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
    void shouldSearchBy() {
        String textForSearch = "Java";


        manager.add(java3);
        manager.add(many);

        manager.searchBy(textForSearch);

        Product[] expected = new Product[]{java3, };
        Product[] actual = manager.searchBy(textForSearch);
        assertArrayEquals(expected, actual);



    }
}