package app.ecommerce.ui.model;

import android.graphics.drawable.Drawable;

public class ItemProductListSimple {

    public int image;
    public String name;
    public String description;
    public String price;

    public ItemProductListSimple(int image, String name, String description, String price) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
