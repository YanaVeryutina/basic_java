package ya.kor;

public class Article {

    String title;
    String author;
    int pages;


    public void sayTitle() {
        System.out.println(title);
    }

    public void sayAuthor() {
        System.out.println(author);
    }

    public void sayPages() {
        System.out.println(pages);
    }

    public static void main(String[] args) {
        Article book = new Article();
        book.author = "Dostoevskiy";
        book.title = "The Idiot";
       Article poem = new Article();
        poem.title = "Eugen Onegin";
        poem.pages = 200;
        Article journal = new Article();
        journal.title = "Yes";
        journal.pages = 25;
        book.sayAuthor();
        book.sayTitle();
        journal.sayTitle();
        journal.sayPages();
        poem.sayTitle();
        poem.sayPages();
    }
}
