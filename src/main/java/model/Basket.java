package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Integer> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    public List<Integer> getBasketList() {
        return basketList;
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
