public class book {
    String title;
    String author;
    String genre;

    public book(String t, String a, String g){
        title = t;
        author = a;
        genre = g;
    }

    void checkBook(){
        if (this.title.equals("The Giving Tree")){
            System.out.println("Shel Silverstein looks really creepy on the book cover");
        } else {
            System.out.println("This book is not The Giving Tree");
        }
    }
}
