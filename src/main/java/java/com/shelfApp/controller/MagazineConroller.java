package java.com.shelfApp.controller;

import java.com.shelfApp.model.Magazine;

import java.util.List;

public class MagazineConroller {
    private MagazineRepository javaIOMagazineRepositoryImpl = new JavaIOMagazineRepositoryImpl();
    public Magazine getById(long id){
        return javaIOMagazineRepositoryImpl.getById(id);
    }
    public List<Magazine> getAllSkills(){
        return javaIOMagazineRepositoryImpl.getAll();
    }
    public Magazine save(Magazine magazine){
        return javaIOMagazineRepositoryImpl.save(magazine);
    }
    public void deleteById(Long id){javaIOMagazineRepositoryImpl.deleteById(id);
    }
}
