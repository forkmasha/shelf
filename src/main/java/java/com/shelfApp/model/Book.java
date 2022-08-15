package java.com.shelfApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Item {

    public int id;

    public String name;

    private String author;
    public int pages;

    private String publishingDate;
    public boolean borrowed;
//    private BorrowStatus borrowStatus;

    public Book(String s, int parseInt) {
        super();
    }

    public Book(String name, String author, int pages, String publishingDate, boolean borrowed) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.publishingDate = publishingDate;
        this.borrowed = borrowed;
    }
    //    public boolean isBorrowed() {
//        return borrowed;
//    }
//
//    public void setBorrowed(boolean borrowed) {
//        this.borrowed = borrowed;
//    }

//    public Book(int id,String name,String author,int pages, String publishingDate) {
//        super.id=id;
//        super.name=name;
//        this.author = author;
//        super.pages=pages;
//        this.publishingDate = publishingDate;
//        super.borrowed=false;
//    }

    

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