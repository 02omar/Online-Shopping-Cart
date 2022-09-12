package model.supermarket;

import model.cart.Cart;

public interface SupermarketListener {
	void onCartUpdated(Cart cart);
}
