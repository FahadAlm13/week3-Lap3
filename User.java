import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> purchasedMediaList ;
    private ArrayList<Media> shoppingCart;


    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void addToCart(Media media) {
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }
    public void checkout(){
            purchasedMediaList.addAll(shoppingCart);
            shoppingCart.clear();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", purchasedMediaList=" + purchasedMediaList +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
