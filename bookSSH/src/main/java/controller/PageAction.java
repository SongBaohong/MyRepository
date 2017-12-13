package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BookService;

import java.util.List;
import java.util.ArrayList;

@WebServlet("/PageServlet")
public class PageAction extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int page = 1;
        int pageCount = 3;

        String page1 = request.getParameter("page");
        String pageCount1 = request.getParameter("pageCount");

        List<String> list = new ArrayList<>();

        try {
            if (page1 != null && !("".equals(page1))) {
                page = Integer.parseInt(page1) - 1;
            }
        } catch (Exception e) {
            System.out.println("页码的数字格式不对，不能有出数字外以外的字符或者参数没有获取到");
        }

        try {
            if (pageCount1 != null && !("".equals(pageCount1))) {
                pageCount = Integer.parseInt(pageCount1);
            }
        } catch (Exception e) {
            System.out.println("每页的显示条数的数字格式不对，不能有出数字外以外的字符或者参数没有获取到");
        }
        
       /* BookService service = BookService.getService();*/
        int[] ii = { page, pageCount };
        request.setAttribute("ii", ii);
        request.setAttribute("cc", "jia");
        request.getRequestDispatcher("listBook.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
