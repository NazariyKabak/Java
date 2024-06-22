package OOP.Task3;

import java.time.LocalDate;

public class Reader {
    String firstName;

    int numberTicket;
    String faculty;
    int birthdate;
    String phoneNumber;
    public Reader(String firstName,  int numberTicket, String faculty, int birthdate, String phoneNumber) {
        this.firstName = firstName;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }
    public void takeBook(int numberBook){
        System.out.println(firstName+"take book"+numberBook);
    }
    public void takeBook(String ...bookTitles){
        System.out.println(firstName+"take book");
        for(String bookTitle : bookTitles){
            System.out.println(bookTitle+",");
        }
        System.out.println();
    }
    public void takeBook(OOP.Task3.Book...books){
        System.out.println(firstName+"take book");
        for(Book book : books){
            System.out.println(book.title+"author"+book.author);
        }
        System.out.println();
    }
    public void returnBook(int numberBook){
        System.out.println(firstName+"return book"+numberBook);
    }



}
