package java.com.shelfApp.model;

import lombok.Data;

@Data
public class Magazine extends Item {


    public Magazine(int id,String name,int pages) {
        super.id=id;
        super.name=name;
        super.pages=pages;
        super.borrowed=false;
    }

}
