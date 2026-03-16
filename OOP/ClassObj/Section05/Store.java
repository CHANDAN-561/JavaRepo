package OOP.ClassObj.Section05;

import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        this.books = new ArrayList<>();
    }

    // getter & setter...
    public Book getBook(int index) {
        return new Book(this.books.get(index)); // deep copy
    }

    public void setBook(int index, Book bookToSet) {
        this.books.set(index, new Book(bookToSet));
    }

    public void addBook(Book newBook) {
        books.add(new Book(newBook));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle() == title) {
                this.books.remove(i);
            } else {
                System.out.println("The title " + title + " doesn't exist.");
            }
        }
    }
}