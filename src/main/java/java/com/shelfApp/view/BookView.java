package java.com.shelfApp.view;

import java.util.List;
import java.util.Scanner;

public class BookView {
    private BookView bookView = new BookView();
    private static final String start = "Press 1 to add the book\nPress 2 to delete the book\nPress 3 to borrow the book" +
            "\nPress 4 to get all the books\nPress 5 to sort books\nPress 6 to find the book\n Press 7 Exit";
    private static final String end = "Successfully";

    private static final String text1 = "Enter book name: ";
    private static final String text2 = "Enter author name: ";
    private static final String text3 = "Enter book pages: ";
    private static final String text4 = "Enter the publishing data of the book: ";
    private static final String text5 = "Select item of sorting: \n1) Sorting by name \n2) Sorting by author \n 3) Sorting by pages\n 4)Exit";
    private static final String text6="Enter book id: ";


    public void showBookMenu() {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println(start);
            switch (choice = in.nextInt()) {
                case 1:

                case 2:
                    System.out.println(text6);
                    bookController.deleteById(in.nextLong());
                    System.out.println(end);
                    break;
                case 3:
                case 4:
                    List<Books> books = bookController.getAllBooks();
                    System.out.println(books+"\n");
                    break;
                case 5:
                case 6:
                    System.out.println(text6);
                    long id = in.nextLong();
                    System.out.println(bookController.getById(id)+"\n");
                    break;
                case 7:
                    break;
                while (choice != 7) {
                    System.out.println("Please write correct number");
                }

            }
        }
    }
}