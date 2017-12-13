package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.sun.org.apache.regexp.internal.RE;

import model.Book;
import service.BookService;

@Controller
@Namespace("/")
@ParentPackage("struts-default")

@Results({ @Result(name = "success", location = "/bookRegSucc.jsp"),
        @Result(name = "input", location = "/bookRegister.jsp"),
        @Result(name = "succ", location = "/bookUpSucc.jsp") })
public class BookRegisterAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Resource
    private BookService bookservice;

    // @Resource(name="Book")
    private Book book;

    private int id;

    private String bookName;

    private String bookClass;

    private String bookAuthor;

    private float bookDiscount;

    private float bookPrice;

    private int bookCount;

    private String bookIntroduce;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @RequiredStringValidator(key = "bookName.error.null", trim = true)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @RequiredStringValidator(key = "bookClass.error.null", trim = true)
    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    @RequiredStringValidator(key = "bookAuthor.error.null", trim = true)
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @DoubleRangeFieldValidator(key = "bookDiscount.error.null", minInclusive = "0.1", maxInclusive = "1.0")
    public float getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(float bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    @DoubleRangeFieldValidator(key = "bookPrice.error.null")
    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    @IntRangeFieldValidator(key = "bookCount.error.null", min = "1")
    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    @RequiredStringValidator(key = "bookIntroduce.error.null")
    public String getBookIntroduce() {
        return bookIntroduce;
    }

    public void setBookIntroduce(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce;
    }

    @Override
    @Action("BookRegisterAction")
    public String execute() throws Exception {
        book = new Book(bookName, bookClass, bookAuthor, bookDiscount, bookPrice, bookCount, bookIntroduce);
        bookservice.insert(book);
        return SUCCESS;
    }

    @Action("BookUpdateAction")
    public String update() throws Exception {
        book = new Book(id,bookName, bookClass, bookAuthor, bookDiscount, bookPrice, bookCount, bookIntroduce);
        bookservice.update(book);
        return "succ";
    }
}
