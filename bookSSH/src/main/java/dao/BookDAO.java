package dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import exception.BookException;
import model.Book;

@Repository
@Transactional
@Scope("singleton")
public class BookDAO {

    @Resource
    private HibernateTemplate hibernateTemplate;

    // 查询全部表中的数据
     @SuppressWarnings("unchecked")
    public List<Book> selectAll() {
        return  hibernateTemplate.execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                List<Book> list = new ArrayList<>();
                String hql="from Book";
                Query query = session.createQuery(hql);
                list = query.list();
                return list;
            }
         });
     }
     

    // 通过ID查询数据
     @SuppressWarnings("unchecked")
     public Book selectById(final int id) {
         
         return hibernateTemplate.execute(new HibernateCallback() {
             @Override
             public Object doInHibernate(Session session) {
                 String hql = " from Book where id=?";
                 Query query = session.createQuery(hql);
                 query.setInteger(0, id);
                 Book book = (Book)query.uniqueResult();
                 return book;
             }
         });
      
     }
    // 通过名字查询数据记录行
    @SuppressWarnings("unchecked")
    public Book selectDetail(final String bookName) {
        
        return hibernateTemplate.execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) {
                String hql = " from Book where bookName=?";
                Query query = session.createQuery(hql);
                query.setString(0, bookName);
                 Book book = (Book)query.uniqueResult();
                 System.out.println(book);
                return book;
            }
        });
     
    }
    // 插入
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void insert(final Book book) {
        hibernateTemplate.execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) {
                session.save(book);
                return null;
            }
        });
    }
    // 删除
    @SuppressWarnings("unchecked")
    public void delete(final int id)  {
        // 内部类中的函数
        hibernateTemplate.execute(new HibernateCallback() {

            @Override
            public Object doInHibernate(Session session) {
                String hql = "delete from Book where id=?";
                Query query = session.createQuery(hql);
                query.setInteger(0, id);
                query.executeUpdate();
                return null;
            }
        });
    }
    // 更新
   @SuppressWarnings("unchecked")
public void update(final Book book){
       hibernateTemplate.execute(new HibernateCallback() {

           @Override
           public Object doInHibernate(Session session) {
               
               session.saveOrUpdate(book);
//               session.update(book);
               session.flush();
//               session.setFlushMode(FlushMode.AUTO);
               
               return null;
           }
       });
   }

}
