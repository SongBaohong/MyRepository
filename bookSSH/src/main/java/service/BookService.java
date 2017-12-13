package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import model.Book;
import dao.BookDAO;
import exception.BookException;


@Service
@Scope("singleton")
@Transactional
public class BookService {
    
    @Resource
    private  BookDAO bookdao;
    

   //查询指定的页面
   /* public List<Book> selectPage(Object...param){
        return bookDao.selectPage(param);
    }*/
    
    //返回Page的bean类
    /*public Page getPage(int page,int pageCount){
        Page p = new Page();
        p.setPage(page);
        p.setPageCount(pageCount);
        return p;
    }*/
    
   //查询一条数据的详细信息 
    public Book  selectDetail(String bookName){
        
        return bookdao.selectDetail(bookName);
   }
    
    //通过id查询一条数据的详细信息 
    public Book  selectById(int id){
        
         return bookdao.selectById(id);
    }
    
    
    
  //查询所有数据信息 
    public List<Book>  selectAll (){
        
        return bookdao.selectAll();
    }
    //插入
    public void  insert(Book book){
        
         bookdao.insert( book);
    }

   
    //删除
    public void delect(int id){
        
        bookdao.delete(id);
    }
    
    //更新
    public void  update(Book book){
         bookdao.update(book);
    }
}
