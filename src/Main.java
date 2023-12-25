import models.Cart;

public class Main {
    public static void main(String[] args) {
        int[] prices1 = {2, 3, 5};
        Cart cart1 = new Cart(0, "Shop1", prices1);

        int[] prices2 = {12, 43, 56};
        Cart cart2 = new Cart(1, "Shop2", prices2);

        int[] prices3 = {89, 88, 55};
        Cart cart3 = new Cart(1, "Shop3", prices3);

        cart1.cartTotal();
        cart2.cartTotal();
        cart3.cartTotal();
    }
}