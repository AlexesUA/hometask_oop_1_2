package homeLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeLibrary {
    private int countBooks;
    private ArrayList<Book> booksShelf;
    public Scanner scInput;


    public HomeLibrary(){
        countBooks = 0;
        booksShelf = new ArrayList<Book>();
        scInput = new Scanner(System.in);
    }

    private String CheckEmptyString(String titleInput){

        String value;
        do {
            System.out.print(titleInput);
            value = scInput.nextLine();
            if (value == "") System.out.println("Строка не може бути порожнйою. ");
            else return value;
        }while (true);
    }

    public int GetCountBooks(){return countBooks;}
    public void AddBook(){

        System.out.println("Додайте нову книгу. ");

        String newTitleBook = CheckEmptyString("Введіть назву книги: ");

        System.out.println("Додайте автора/авторів книги. ");
        char more = 'y';
        ArrayList<String> newAuthors = new ArrayList<String>();
        do{
            newAuthors.add(CheckEmptyString("Введіть ім'я автора книги: "));
            System.out.print("Додайте ще автора книги? y/n:  ");
            do {
                more = scInput.next().toLowerCase().charAt(0);
            }while (more!='y' && more!='n');

        }while(more=='y');

        System.out.println("Додайте зміст книги. ");
        more = 'y';
        ArrayList<String> newContent = new ArrayList<String>();
        do{
            newContent.add(CheckEmptyString("Введіть рядок зміста книги: "));
            System.out.print("Додайте ще рядок зміста книги? y/n:  ");
            do {
                more = scInput.next().toLowerCase().charAt(0);
            }while (more!='y' && more!='n');

        }while(more=='y');


        booksShelf.add(new Book(newTitleBook,newAuthors,newContent));
        countBooks = booksShelf.size();
    }

    public void PrinkLibrary(){
        for(int i=0; i<booksShelf.size(); i++){
            System.out.println("Книга № " + i+1 + "= = = = = = = = = = = = = = = = = = = = =");
            booksShelf.get(i).ShowBook();
            System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        }
    }

}
