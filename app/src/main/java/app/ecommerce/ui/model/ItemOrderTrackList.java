package app.ecommerce.ui.model;

import android.graphics.drawable.Drawable;

public class ItemOrderTrackList {

    public String orderId;
    public String date;
    public String status;

    public ItemOrderTrackList(String orderId, String date, String status) {
        this.orderId = orderId;
        this.date = date;
        this.status = status;
    }
}
