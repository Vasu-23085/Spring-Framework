package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//
//        AppConfig app = context.getBean(AppConfig.class);
//        app.demo();

//        UserService user = context.getBean(UserService.class);
//        user.setBeanName();

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

    }
}
