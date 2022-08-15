package java.com.shelfApp.controller;

import java.com.shelfApp.model.Book;
import java.com.shelfApp.repository.BookRepository;
import java.com.shelfApp.repository.io.JavaIOBookRepositoryImpl;
import java.util.List;

public class BookController {
    private BookRepository javaIOBookRepository = new JavaIOBookRepositoryImpl();
    public Book getById(Integer id){
        return javaIOBookRepository.getById(id);
    }
    public List<Book> getAllBooks(){
        return javaIOBookRepository.getAll();
    }
    public Book save(Book book){
        return javaIOBookRepository.save(book);
    }
    public void deleteById(Integer id){
        javaIOBookRepository.deleteById(id);
    }
}
