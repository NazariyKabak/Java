package Imitation.record.task13;

public record TypeBook(String title, String author, int pages) {

    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
