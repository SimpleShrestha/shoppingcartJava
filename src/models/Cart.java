package models;

public class Cart {
    int id;
    String shop_name;
    int[] item_price;

    public Cart(int id, String shop_name, int[] item_price) {
        this.id = id;
        this.shop_name = shop_name;
        this.item_price = item_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int[] getItem_price() {
        return item_price;
    }

    public void setItem_price(int[] item_price) {
        this.item_price = item_price;
    }

    public void cartTotal() {
        int totalPrice = 0;
        for(int i = 0; i < item_price.length; i++){
            totalPrice += item_price[i];
        }
        System.out.println("In shop: " + shop_name);
        System.out.println("Total number of items: " + item_price.length);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("   ");
    }
}
