package com.LibraryManagementSystem.Assignment.repository;

import com.LibraryManagementSystem.Assignment.entitites.Book;
import com.LibraryManagementSystem.Assignment.utils.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(Category category);
    Optional<Book> findByIsbn(String isbn);
}
