package pro.sky.spring_home_work_basket.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

    public void add(List<Integer> ids) {
        basketList.addAll(ids);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + basketList +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Basket basket = (Basket) object;
        return Objects.equals(basketList, basket.basketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basketList);
    }
}
