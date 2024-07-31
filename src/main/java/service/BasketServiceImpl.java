package service;

import model.Basket;

import java.util.List;

public class BasketServiceImpl implements BasketService {

    private Basket basket;

    @Override
    public void add(Integer ID) {

    }

    @Override
    public List<Integer> get() {
        return basket.getBasketList();
    }
}
