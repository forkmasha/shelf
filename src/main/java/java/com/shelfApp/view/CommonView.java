package java.com.shelfApp.view;

import java.util.Scanner;

public class CommonView {
    private BookView bookView=new BookView();
    private MagazineView magazineView=new MagazineView();
    private static final String text="Select item: \n1) Book menu \n2) Magazine menu \n3) Exit program";
    public void run() {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println(text);
            switch (choice = in.nextInt()) {
                case 1:
                    bookView.showBookMenu();
                    break;
                case 2:
                    magazineView.showMagazineMenu();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
            }
            while (choice != 4) {
                System.out.println("Please,write correct number");
            }
        }
    }
}
