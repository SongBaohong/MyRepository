package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.Book;
import service.BookService;

@Controller
@Namespace("/")
@ParentPackage("struts-default")

@Results({ @Result(name = "success", location = "/bookDetails.jsp"),
        @Result(name = "input", location = "/index.html"),
        @Result(name = "allsucc", location = "/listBooks.jsp"),
        @Result(name = "delesucc", location = "/bookDelete.jsp"),
        @Result(name = "updateSucc", location = "/updateForm.jsp")

})
public class BookAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private Book book;
    private String bookName;
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Resource
    private BookService bookservice;

    @Override
    @Action("BookDetailNameAction")
    public String execute() throws Exception {

        book=bookservice.selectDetail(bookName);
        System.out.println(bookName);
        return SUCCESS;
    }

    @Action("SelectAllAction")
    public String selectAll() throws Exception {
        List<Book> list = bookservice.selectAll();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
                .get(ServletActionContext.HTTP_REQUEST);
        request.setAttribute("list", list);
        return "allsucc";
    }

    @Action("SelectDetailByIdAction")
    public String selectById() throws Exception {
        
       book = bookservice.selectById(id);
        
        return SUCCESS;
    }
    
    @Action("updateAction")
    public String updateAction() throws Exception {
        book = bookservice.selectById(id);
        System.out.println(book.getBookDiscount());
        return "updateSucc";
    }
    @Action("DeleteAction")
    public String delete() throws Exception {
        bookservice.delect(id);
        return "delesucc";
    }
}
