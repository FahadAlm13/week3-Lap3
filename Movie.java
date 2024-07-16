import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String isbn, double price, int duration) {
        super(title, auteur, isbn, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.addToCart(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }

    public String getMediaType() {
        return duration >= 120 ? " Long Movie " : "Movie";
    }

    public String toString() {
        return super.toString() + " , Duration : " + duration + " minutes";
    }
}
