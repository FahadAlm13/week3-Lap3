import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private int artist;

    public Music(String title, String auteur, String isbn, double price, int artist) {
        super(title, auteur, isbn, price);
        this.artist = artist;
    }

    public int getArtist() {
        return artist;
    }

    public void setArtist(int artist) {
        this.artist = artist;
    }

    public void listen(User user) {
        user.addToCart(this);
//        user.checkout();
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist() == this.artist) {
                playlist.add(music);
            }
        }
        return playlist;
    }

    public String getMediaType(){
        return getPrice() >=10 ? " Premium Music :" : "Music";
    }
    public String toString(){
        return super.toString() + " , Artist : " + artist;
    }
}
