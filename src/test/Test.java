package test;

import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

/**
 * Created by 89345 on 2018-5-23.
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        Address ail = (AddressImpl)ac.getBean("address");
        Addresslist al = new Addresslist();
        al.setName("kaka");
        al.setPhone("123456123");
        ail.add(al);
    }
}
