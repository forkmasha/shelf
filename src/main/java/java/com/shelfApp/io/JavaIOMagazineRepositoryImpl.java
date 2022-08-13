package java.com.shelfApp.io;

import java.com.shelfApp.model.Magazine;

import java.util.ArrayList;
import java.util.List;

import static java.com.shelfApp.utils.IOUtils.readFromFile;
import static java.com.shelfApp.utils.IOUtils.writeToFile;

public class JavaIOMagazineRepositoryImpl {
    private String path = "D:/work/shelf/src/main/java/resources/Magazine.txt";

    public Magazine getById(Long id) {
        try {
            String[]  magazineAllRecords = readFromFile(path).split("/");
            for (String s : magazineAllRecords) {
                String[] skillsRecords = s.split(",");
                if (Long.parseLong(skillsRecords[0]) == id) {
                    return new Magazine(Long.parseLong(magazineRecords[0]), magazineRecords[1]);
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error is occurred in getById method " + e.getMessage());
        }
    }

    public List<Magazine> getAll() {
        List<Magazine> magazineList = new ArrayList<>();
        try {
            getMagazineCollection(magazineList);
        } catch (Exception e) {
            throw new RuntimeException("Error is occurred in getAll method " + e.getMessage());
        }
        return magazineList;
    }
    public Magazine       save(Magazine magazine) {
        List<Magazine> magazineList = new ArrayList<>();
        try {
            getSkillCollection(magazineList);
            magazineList.add(magazine);
            writeToFile(path,idGenerator() + "," + magazine.getName() + "/", true);


        } catch (Exception e) {
            throw new RuntimeException("Error is occurred in save method" + e.getMessage());
        }
        return magazine;
    }
    public void        deleteById(Long id) {
        List<Magazine> magazineList = new ArrayList<>();

        try {
            getMagazineCollection(magazineList);
            magazineList.removeIf(magazine -> magazine.getId() == id);


            writeToFile(path, "", false);
            for (Magazine o : magazineList) {
                writeToFile(path, o.getId() + "," + o.getName() + "/\n", true);
            }

        } catch (Exception e) {
            throw new RuntimeException("Error is occurred in delete method " + e.getMessage());
        }
    }
    private long       idGenerator() {
        try {
            String[] skillsAllRecords = readFromFile(path).split("/");
            return skillsAllRecords.length + 1;
        } catch (Exception e) {
            throw new RuntimeException("Error is occurred in idGenerator method " + e.getMessage());
        }
    }
    private void       getSkillCollection(List<Magazine> magazineList) {
        try {
            String[] magazineAllRecords = readFromFile(path).split("/");
            for (String s : magazineAllRecords) {
                String[] magazineRecords = s.split(",");
                magazineList.add(new Magazine(Long.parseLong(magazineRecords[0]), magazineRecords[1]));
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Error is occurred in getSkillCollection method " + e.getMessage());
        }
}
