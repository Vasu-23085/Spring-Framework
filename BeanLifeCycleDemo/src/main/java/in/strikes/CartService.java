package in.strikes;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements InitializingBean {

    Map<Integer,String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }

    public void addToCart(){
        System.out.println("Added to cart.");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization callback");
        mp.put(1,"Vasu");
        mp.put(2,"Vishu");
    }

    public String getValue(int key){
        return mp.get(key);
    }

}
