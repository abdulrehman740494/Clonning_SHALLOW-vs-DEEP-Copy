package deepCopy.deepCopy_IMMUTABLE;

final class Book {
    private final String title;
    private final int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Immutable: Increment will not modify existing object
    public Book addPages(int extra) {
        return new Book(this.title, this.pages + extra); // new object
    }

    @Override
    public String toString() {
        return "Book_title=" + title + "', pages=" + pages;
    }
}
