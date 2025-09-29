package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
        /*

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // on this line object will be created and stored in the container

        Alien obj1 = (Alien) context.getBean("alien1");  // we are accessing the object

        System.out.println(obj1.getAge());
        System.out.println(obj1.getSal());
        obj1.code();


        Desktop d = (Desktop) context.getBean("com");

        */

        // for the getBean in diff way

        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // on this line object will be created and stored in the container

        Alien obj1 = context.getBean("alien1",Alien.class);  // we are accessing the object

        System.out.println(obj1.getAge());
        System.out.println(obj1.getSal());
        obj1.code();

        //Computer c = context.getBean(Computer.class);

        Desktop d = (Desktop) context.getBean(Desktop.class);

         */





        /*
        when we use singleton scope then automatically after the applicationContext the object will create
        but in case of prototype the object will create after the getBean is getting call every time
         */




        // Java Based Approach

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

    }
}
