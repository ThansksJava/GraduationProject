package java.com.jie.jobs.students.dao;

import com.jie.jobs.students.dao.StudentDao;
import com.jie.jobs.students.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiefeng on 2017/5/11.
 */
public class StudentDaoTest
{
    private static ApplicationContext context = null;
    static{
        context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }
    @Test
    public void studentRegistTest()
    {
        SessionFactory sessionFactory = context.getBean("sessionFactory",SessionFactory.class);
        System.out.println("sessionFactory:"+sessionFactory);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Student student = new Student();
        student.setStuid(99999);
        student.setStuaddr("1");
        student.setStutype("1");
        student.setStuaddrcode("1");
        student.setStubirth("1");
        student.setStudep("1");
        student.setStuemail("1");
        student.setStugender("1");
        student.setStuidcard("1");
        student.setStumajor("1");
        student.setStuname("1");
        student.setStunation("1");
        student.setStunative("1");
        student.setStunativecode("1");
        student.setStumajor("1");
        student.setStuno("11");
        student.setStutel("111");
        tx.commit();
        session.close();
    }
}
