package java.com.shelfApp.controller;

import java.util.List;

public class BookController {
    private BookRepository javaIOBookRepository = new JavaIOBookRepositoryImpl();
    public Book getById(long id){
        return javaIOBookRepository.getById(id);
    }
    public List<Book> getAllBooks(){
        return javaIOBookRepository.getAll();
    }
    public Book save(Book book){
        return javaIOBookRepository.save(book);
    }
    public void deleteById(Long id){
        javaIOBookRepository.deleteById(id);
    }
}
