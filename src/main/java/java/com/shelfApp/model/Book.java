package java.com.shelfApp.model;

public class Book extends Item {
    private String author;
    private String publishingDate;

    public Book(String name,String author,int pages, String publishingDate) {
        super.name=name;
        this.author = author;
        super.pages=pages;
        this.publishingDate = publishingDate;
        super.borrowed=false;
    }
    @Override
    public String toString(){
        return "model.Book{" +
                "name=" + name +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", publishing date=" + publishingDate +
                '}';
    }
}