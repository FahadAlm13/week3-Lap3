import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Integer> reviews;

    public Book(String title, String auteur, String isbn, double price, int stock) {
        super(title, auteur, isbn, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public void addReview(int review) {
        this.reviews.add(review);
    }

    public double getAverage() {
        if (reviews.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Integer review : reviews) {
            sum += review;

        }
        return sum / reviews.size();
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.addToCart(this);
            user.checkout();
            stock--;
        } else System.out.println("Out of stock");

    }

    public boolean isBestSeller() {
        return getAverage() >= 4.5;
    }

    public String getMediaType() {
        return isBestSeller() ? " Bestselling Book " : "Book";
    }

    public void restock(int quantity) {
        this.stock += quantity;
        System.out.println("Restocked " + quantity + " Average Rating: " + getAverage());
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}


