package itheima.第八题;
public class Book {
    private String bookId;
    private String title;
    private String isbn;
    private double price;
    private String publicationDate;
    public Book(String bookId,String title,String isbn,double price,String publicationDate){
        super();
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.publicationDate = publicationDate;
    }

    public Book(){
        super();
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(){
        this.bookId = bookId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(){
        this.isbn = isbn;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(){
        this.publicationDate = publicationDate;
    }
}
