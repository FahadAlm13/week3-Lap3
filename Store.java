import java.util.ArrayList;

public class Store {
    private ArrayList<User> users=new ArrayList<>();
    private ArrayList<Media> medias=new ArrayList<>();

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> user) {
        this.users = user;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addMedia(Media media) {
        this.medias.add(media);

    }

    public ArrayList<User> displayUser() {
        return users;
    }

    public ArrayList<Media> displayMedias() {
        return medias;
    }

    public Book serchBook(String title) {
        for (Media media : medias) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }

}

