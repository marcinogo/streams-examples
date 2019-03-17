package zadanko1;

class Book {


    private String title;
    private Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }
}
