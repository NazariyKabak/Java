package Imitation.record.task13;

public record TypeJournal(String title, String editor, int issueNumber) {

    @Override
    public String toString() {
        return "Journal: " + title + ", Editor: " + editor + ", Issue Number: " + issueNumber;
    }
}
