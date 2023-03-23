
//Розумію, що використовувати списки, то ще зарано, але...
//Я зробив (практично) на масивах, але там дуже багато коду, тому розібрався трохи в списках...
//Та программу можна ще вдосконалювати і вдосконалювати. :)

import homeLibrary.HomeLibrary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HomeLibrary homeLibraries = new HomeLibrary();
        char marker = 'n';

        do {
            System.out.printf("Ваша бібліотека складається з %1$s книг %n", homeLibraries.GetCountBooks());
            do {
                System.out.print("Додати книгу - y, Пропустити - n, Роздрукувати бібліотеку - p, Вихід - q");
                marker = homeLibraries.scInput.next().toLowerCase().charAt(0);
            }while (marker != 'q' || marker != 'y' || marker != 'n' || marker != 'p');

            switch (marker){
                case 'y':
                    homeLibraries.AddBook();
                    break;
                case 'p':
                    homeLibraries.PrinkLibrary();
                    break;
            }


        }while (marker != 'q');
    }
}