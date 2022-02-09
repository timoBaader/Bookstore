package com.example.baaderbookstore;

import com.example.baaderbookstore.web.Model.Book;
import com.example.baaderbookstore.web.Model.Category;
import com.example.baaderbookstore.web.Repository.BookRepository;
import com.example.baaderbookstore.web.Repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BaaderbookstoreApplication {
    private static final Logger log = LoggerFactory.getLogger(BaaderbookstoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BaaderbookstoreApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(BookRepository bookRepository, CategoryRepository categoryRepository) {
        return (args) -> {

            Category category = new Category("Horror");


            Category category2 = new Category("Fantasy");
            

            categoryRepository.save(category);
            categoryRepository.save(category2);

            log.info("Save a couple of books");
            Book book = new Book();
            book.setAuthor("Terence Mckenna");
            book.setIsbn("9272-123-7161");
            book.setPrice(20);
            book.setTitle("True Hallucinations");
            book.setYear(1995);
            book.setCategory(category);

            Book book2 = new Book();
            book2.setAuthor("Michael Pollan");
            book2.setIsbn("8272-133-8233");
            book2.setPrice(9.90);
            book2.setTitle("How to change your mind");
            book2.setYear(1992);
            book.setCategory(category2);

            Book book3 = new Book();
            book3.setAuthor("Aldous Huxley");
            book3.setIsbn("4161-873-9347");
            book3.setPrice(12);
            book3.setTitle("The doors of perception");
            book3.setYear(1971);
            book.setCategory(category2);


            bookRepository.save(book);
            bookRepository.save(book2);
            bookRepository.save(book3);


            log.info("Fetch all books");
            for (Book item : bookRepository.findAll()) {
                log.info(item.toString());
            }

        };
    }
}
