package java.com.shelfApp.model;

import lombok.Data;

@Data
public class Magazine extends Item {

    public Magazine(String name,int pages) {
        super.name=name;
        super.pages=pages;
        super.borrowed=false;
    }

}
