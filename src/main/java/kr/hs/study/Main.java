package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        /* TestBean 클래스에 t1이라는 이름을 가진 객체의 주소값을 obj1에 저장 */
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1: "+obj1);

        TestBean obj11 = ctx.getBean("t11", TestBean.class);
        System.out.println("obj1-2: "+obj11);

        System.out.println("--------------------------------------------");

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        System.out.println("obj2: "+obj2);

        ctx.close();
        System.out.println("Hello world!");
    }
}