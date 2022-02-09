package com.example.baaderbookstore;

import com.example.baaderbookstore.web.Model.Book;
import com.example.baaderbookstore.web.Repository.BookRepository;
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
	CommandLineRunner demo(BookRepository bookRepository) {
		return (args) -> {
			log.info("Save a couple of books");
			bookRepository.save(new Book("True Hallucinations"));
			bookRepository.save(new Book("Sapiens"));
			bookRepository.save(new Book("How to change your mind"));

			log.info("Fetch all books");
			for(Book book : bookRepository.findAll()){
				log.info(book.toString());
			}

		};
	}
}
