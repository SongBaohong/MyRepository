package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String bookName;
    @Column
    private String bookClass;
    @Column
    private String BookAuthor;
    @Column
    private float bookDiscount;
    @Column
    private float bookPrice;
    @Column
    private int bookCount;
    @Column
    private String bookIntroduce;
   
    
    public Book(String bookName, String bookClass, String bookAuthor, float bookDiscount, float bookPrice,
            int bookCount, String bookIntroduce) {
        super();
        this.bookName = bookName;
        this.bookClass = bookClass;
        BookAuthor = bookAuthor;
        this.bookDiscount = bookDiscount;
        this.bookPrice = bookPrice;
        this.bookCount = bookCount;
        this.bookIntroduce = bookIntroduce;
    }
    public Book(int id, String bookName, String bookClass, String bookAuthor, float bookDiscount,
            float bookPrice, int bookCount, String bookIntroduce) {
        super();
        this.id = id;
        this.bookName = bookName;
        this.bookClass = bookClass;
        BookAuthor = bookAuthor;
        this.bookDiscount = bookDiscount;
        this.bookPrice = bookPrice;
        this.bookCount = bookCount;
        this.bookIntroduce = bookIntroduce;
    }
    public Book() {
        super();
    }
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookClass() {
        return bookClass;
    }
    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }
    public String getBookAuthor() {
        return BookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }
    public float getBookDiscount() {
        return bookDiscount;
    }
    public void setBookDiscount(float bookDiscount) {
        this.bookDiscount = bookDiscount;
    }
    public float getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    public String getBookIntroduce() {
        return bookIntroduce;
    }
    public void setBookIntroduce(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", bookClass=" + bookClass + ", BookAuthor="
                + BookAuthor + ", bookDiscount=" + bookDiscount + ", bookPrice=" + bookPrice + ", bookCount="
                + bookCount + ", bookIntroduce=" + bookIntroduce + "]";
    }
    
    
}
