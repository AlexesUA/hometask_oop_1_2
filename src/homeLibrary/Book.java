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

    public void setTitleBook(String titleBook) {this.titleBook = titleBook;}
    public String getTitleBook() {return titleBook;}

    public void AddAuthor(String name){
        Author[] newAuthors = new Author[authorsBook.length+1];
        int i=0;
        for (; i<authorsBook.length; i++){
            newAuthors[i] = authorsBook[i];
        }
        newAuthors[i].SetAuthor(name);
    }

    public void ShowAuthors(){
        if(authorsBook.length==1) System.out.print("Автор: ");
        else System.out.print("Автори: ");

        for(int i=0; i<authorsBook.length; i++){
            authorsBook[i].ShowAuthor();
            if (i<authorsBook.length-1)System.out.print(", ");
            else System.out.println(". ");

        }
    }


}
