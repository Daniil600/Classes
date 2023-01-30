package lesson1;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearPublication;

    public Book(String nameBook, Author nameAuthor, int yearPublication){
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getYearPublication() {
        return yearPublication;
    }

}
