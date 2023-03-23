package homeLibrary;

import java.util.ArrayList;

public class Book {
    private String titleBook;
    private ArrayList<Author> authorsBook;
    private ArrayList<Content> contentsBook;

    public Book(String titleBook, ArrayList<String> authorsBook, ArrayList<String> contentsBook){
        this.titleBook = titleBook;
        this.authorsBook = new ArrayList<>();
        for(int i=0; i<authorsBook.size(); i++){this.authorsBook.add(new Author(authorsBook.get(i)));}

        this.contentsBook = new ArrayList<>();
        for(int i=0; i<contentsBook.size(); i++){this.contentsBook.add(new Content(i+1, contentsBook.get(i)));}
    }

    //public void setTitleBook(String titleBook) {this.titleBook = titleBook;}
    public String getTitleBook() {return titleBook;}

    public void AddAuthor(String name){
        authorsBook.add(new Author(name));
    }

    public void ShowAuthors(){
        if(authorsBook.size()==1) System.out.print("Автор: ");
        else System.out.print("Автори: ");

        authorsBook.forEach(author -> ShowAuthors());


    }

    public void AddContent(String content){
        contentsBook.add(new Content(contentsBook.size(), content));
    }

    public void ShowContent(){
        contentsBook.forEach(content -> ShowContent());
    }

    public void ShowBook(){
        System.out.println("Книга: " + titleBook);
        ShowAuthors();
        ShowContent();
    }


}
