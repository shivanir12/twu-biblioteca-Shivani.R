package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.LibrarianMenuView;
import com.twu.biblioteca.View.LoginView;
import com.twu.biblioteca.View.UserMenuView;

import java.util.ArrayList;


//This Class is the entry point for the application.
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        Book book2 = new Book("WWW", "robert", "1950");
        Book book3 = new Book("DS", "sahani", "1956");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        availableBookList.add(book2);
        availableBookList.add(book3);

        Movie movie1 = new Movie("manam","1960","anup","9");
        Movie movie2 = new Movie("akash","2000","puneeth","8");
        Movie movie3 = new Movie("appu","1960","srk","9");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        InputOutput inputOutput = new InputOutput();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);

        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        User user2 = new User("123-1001","poorva","poorva","poorva@gmail.com","9481816386","librarian");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        UserMenuView userMenuView = new UserMenuView(inputOutput);

        Application application = new Application(inputOutput);
        application.showWelcomeMessage();
        Controller controller = new Controller(inputOutput, library, userMenuView);

        LoginView loginView = new LoginView();
        loginView.validateUserLoginDetails(inputOutput, users, controller);
    }
}