public class Novel extends Book {
    private String genre;

    public Novel(String title, String auteur, String isbn, double price, int stock, String genre) {
        super(title, auteur, isbn, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType() {
        return getAverage() >= 4.5 ? " Bestselling Novel " : "Novel";
    }

    public String toString() {
        return super.toString() + " , Genre " + genre;
    }

}
