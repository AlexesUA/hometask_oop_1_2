package homeLibrary;

public class Book {
    private String titleBook;
    private Author[] authorsBook;
    private Content[] contentsBook;

    public Book(String titleBook, Author[] authorsBook, Content[] contentsBook){
        this.titleBook = titleBook;
        this.authorsBook = authorsBook;
        this.contentsBook = contentsBook;
    }


}
