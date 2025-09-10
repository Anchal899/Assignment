package Iterators_Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 implements Comparable<Question1>{
        String title;
        String author;
        int publication_year;

        Question1(String title, String author, int publication_year){
            this.title=title;
            this.author=author;
            this.publication_year=publication_year;

        }
        @Override
        public int compareTo(Question1 book){
            return Integer.compare(book.publication_year,this.publication_year);
        }

        @Override
        public String toString() {
            return "Name: " + title + ", ID: " + author + ", GPA: " + publication_year;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Question1> books = new ArrayList<>();

            books.add(new Question1("The Great Gatsby", "F. Scott Fitzgerald", 1925));
            books.add(new Question1("1984", "George Orwell", 1949));
            books.add(new Question1("To Kill a Mockingbird", "Harper Lee", 1960));
            books.add(new Question1("Pride and Prejudice", "Jane Austen", 1813));
            books.add(new Question1("Moby Dick", "Herman Melville", 1851));

            Collections.sort(books);  //method of comparable interface, calls the compare to method internally
            System.out.println("Sorted Students by ID:");
            for (Question1 book : books) {
                System.out.println(book);
            }

        }
}

//2. Create a Book class with attributes like title, author,
// and publication year. Create a Comparator to sort books by publication year in deinputending order.
