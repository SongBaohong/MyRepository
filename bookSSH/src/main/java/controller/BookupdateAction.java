package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.regexp.internal.RE;

import model.Book;
import service.BookService;
@WebServlet("/BookupdateServlet")
public class BookupdateAction extends HttpServlet {
	private static final long serialVersionUID = 2L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		  
	    request.setCharacterEncoding("UTF-8");
		
		String bookName = request.getParameter("bookName");
		String[] bookClass = request.getParameterValues("bookClass"); 
		String bookAuthor = request.getParameter("bookAuthor"); 
		String bookDiscount = request.getParameter("bookDiscount"); 
		String bookPrice = request.getParameter("bookPrice"); 
		String bookCount = request.getParameter("bookCount"); 
		String bookIntroduce = request.getParameter("bookIntroduce");
		String id1 = request.getParameter("id");
		
		int id = Integer.parseInt(id1);
		List<String> list = new ArrayList<>();
		
		StringBuffer bookClass2 = new StringBuffer();
		for(int i = 0;i<bookClass.length;i++){
		    String str = bookClass[i];
		    if(i==bookClass.length-1){
		        bookClass2 = bookClass2.append(str);
		    }else{ bookClass2 = bookClass2.append(str+" ") ;}
		   
		    
		}
		String bookClass1 = bookClass2.toString(); 
		
		float bookDiscount1=0;
		try{
		    bookDiscount1 = Float.parseFloat(bookDiscount);
                    
                }catch(Exception e){
                    System.out.println("价钱格式不对");
                }
		
		double bookPrice1 = 0;
		try{
		    bookPrice1 = Double.parseDouble(bookPrice);
		    
		}catch(Exception e){
		    System.out.println("价钱格式不对");
		}
		
		int bookCount1 = 0;
		try{
		    bookCount1 = Integer.parseInt(bookCount);
		}catch(Exception e){
		    System.out.println("出数字外不能有其他字符");
		}
		
		if(bookName==null ||bookName.equals("")){
		    list.add("书名不能为空");
		}
		if(bookClass1==null ||bookClass1.length()==0){
		    list.add("书的类别不能为空");
		}
		if(bookAuthor==null ||bookAuthor.equals("")){
		    list.add("书的作者不能为空");
		}
		if(bookDiscount1==0){
		    list.add("必须选择书籍折扣价");
		}
		if(bookPrice1==0){
		    list.add("必须填写书籍价格");
		}
		if(bookCount1==0){
		    list.add("请填写此书籍数量");
		}
		if(bookIntroduce==null ||bookIntroduce.equals("")){
		    list.add("请填写此书籍的简介");
		}
		
                /*if(list.size()==0){
                    BookService service = BookService.getService();
                    
                    Object[] book = {bookName,bookClass1,bookAuthor,
                            bookDiscount1,bookPrice1 ,bookCount1,bookIntroduce,id};
                        if(service.update(book)){
                            request.setAttribute("book",book);
                            request.getRequestDispatcher("bookUpSucc.jsp?id="+id1).forward(request, response);
                        }else{
                            System.out.println(book);
                        }
		 }else{
		     request.setAttribute("list", list);
		     request.getRequestDispatcher("updateForm.jsp").forward(request, response);
		 }*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
