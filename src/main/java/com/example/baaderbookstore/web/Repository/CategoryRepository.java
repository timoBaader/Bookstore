package com.example.baaderbookstore.web.Repository;

import com.example.baaderbookstore.web.Model.Book;
import com.example.baaderbookstore.web.Model.Category;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@ComponentScan
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
