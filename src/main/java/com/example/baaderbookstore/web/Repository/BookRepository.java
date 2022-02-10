package com.example.baaderbookstore.web.Repository;

import com.example.baaderbookstore.web.Model.Book;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@ComponentScan
public interface BookRepository extends CrudRepository<Book, Long> {
}
