package deepCopy.deepCopy_IMMUTABLE;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 200);
        Book b2 = b1.addPages(50); 

        System.out.println("Original Book: " + b1);
        System.out.println("Modified Book: " + b2);
    }
}
