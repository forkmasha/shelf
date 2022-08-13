package java.com.shelfApp.view;

import java.com.shelfApp.model.Magazine;

import java.util.List;
import java.util.Scanner;

public class MagazineView {
    private MagazineController magazineController = new MagazineController();
    private static final String start = "Press 1 to find magazine\nPress 2 to get all magazines\nPress 3 to delete magazine\nPress 4 to create magazine\nPress 5 to borrow magazine \nPress 6 to exit";
    private static final String end = "Successfully";
    private static final String text1 = "Enter magazine id: ";
    private static final String text2 = "Enter magazine name: ";
    private static final String text3 = "Enter magazines pages: ";


    public void showSkillMenu() {

        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println(start);
            switch (choice = in.nextInt()) {
                case 1:
                    System.out.println(text1);
                    long id = in.nextLong();
                    System.out.println(magazineController.getById(id) + "\n");
                    break;
                case 2:
                    List<Magazine> skills = magazineController.getAllMagazines();
                    System.out.println(magazines + "\n");
                    break;
                case 3:
                    System.out.println(text1);
                    magazineController.deleteById(in.nextLong());
                    System.out.println(end + "\n");
                    choice = 6;
                    break;

                case 4:
                    System.out.println(text2);
                    String magazineName = in.next();
                    Magazine magazine = new Magazine(null, magazineName);
                    Magazine savedMagazine = magazineController.save(magazine);
                    System.out.println("Saved magazine: " + savedMagazine + "\n");
                    break;
                case 5:

                    break;
                case 6:
                    break;
            }
        } while (choice != 6);


    }
}
}
