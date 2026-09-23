package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

//        // get bean by ID/name
//        OrderService order = (OrderService) context.getBean("orderService");
//        order.placeOrder();

        // get bean by type
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
    }
}
