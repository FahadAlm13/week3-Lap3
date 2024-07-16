import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String isbn, double price, int stock, String subject) {
        super(title, auteur, isbn, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMediaType(){
        return getAverage() >= 4.5 ? " Bestselling AcademicBook " : " AcademicBook";
    }
    public String toString(){
        return super.toString() + " , Subject " + subject;
    }
}
