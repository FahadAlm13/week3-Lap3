import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Let's create our store -_>
        Store store = new Store();


        User user1 = new User("Fahad", "Fahad@gmai.com");
        User user2 = new User("Abdullah", "Abdullah@gmail.com");


        store.addUser(user1);
        store.addUser(user2);

        //some media
        Book book1 = new Book("Java Program", "Ali", "11223344", 80, 5);
        Novel novel = new Novel("Life","Fahad","834926758",99.8,7,"Drama");
        AcademicBook academicBook = new AcademicBook("Learn English","Tomes","78392465",21.5,10,"English");
        Movie movie1 = new Movie("Venom", "Tom", "558899", 150, 130);
        Movie movie2 = new Movie("Top100", "Jon", "558899", 150, 130);
        Movie movie3 = new Movie("Black See", "Tom", "558899", 150, 130);

        Music music1 = new Music("This is the life", "Amy Macdonald", "8654323", 170, 60);
        Music music2 = new Music("FairyTale", "Alexander", "456798", 60, 25);
        Music music3 = new Music("Poison Prince", "Amy Macdonald", "12346896", 120, 35);

        store.addMedia(book1);
        store.addMedia(novel);
        store.addMedia(academicBook);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println(store.displayMedias());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        user1.addToCart(book1);
        user1.addToCart(novel);
        user1.addToCart(movie1);
        user1.addToCart(movie2);
        System.out.println(user1.getShoppingCart());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();

        List<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);
        List<Movie> recommendedMovies = movie1.recommendSimilarMovies(movieCatalog);
        System.out.println("Recommended movies based on " + movie1.getTitle() + " :");
        for (Movie movie : recommendedMovies) {
            System.out.println(movie.getTitle());
        }
        System.out.println(" ");
        System.out.println(movie1.getTitle() + " is a " + movie1.getMediaType());

        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        user2.addToCart(music1);
        user2.addToCart(music3);

        List<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);

        List<Music> playlist = music1.generatePlaylist(musicCatalog);
        System.out.println("Playlist based on artist " + music1.getArtist() + ":");
        for (Music music : playlist) {
            System.out.println(music.getTitle());
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        user1.checkout();
        user2.checkout();

//        Review review1 = new Review("Fahad",5,"Excellent book!");
        System.out.println(book1.getTitle() + " , Is the best seller ? " + book1.isBestSeller());
        System.out.println("Average rating for " + book1.getTitle() + ": " + book1.getAverage());

        int reviewRating = 5;
        int reviewRating2 = 4;
        book1.addReview(reviewRating);
        book1.addReview(reviewRating2);
        book1.purchase(user1);
        System.out.println(book1.getTitle() + " , Is the best seller ? " + book1.isBestSeller());
        System.out.println("**********************************************************************");
        System.out.println("Average rating for " + book1.getTitle() + ": " + book1.getAverage());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        book1.restock(12);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println(store.displayUser());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
        System.out.println(store.displayMedias());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();

        user1.checkout();
        user2.checkout();
    }
}