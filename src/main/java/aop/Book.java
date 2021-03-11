package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;
    @Value("Фёдор Михайлович Достоевский")
    private String autor;

    public String getAutor() {
        return autor;
    }

    public int getYearOfThePublication() {
        return yearOfThePublication;
    }

    @Value("1866")
    private int yearOfThePublication;

    public String getName() {
        return name;
    }
}
