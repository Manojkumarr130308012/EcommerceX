package app.ecommerce.ui.model;

import java.util.ArrayList;
import java.util.List;

public class ItemMenu {

    public int id;
    public int icon;
    public String type = "PARENT";
    public String title;
    public boolean expand = false;
    public List<ItemMenu> subs = new ArrayList<>();
    public Class activity;

    public ItemMenu(int id, int icon, String title) {
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.type = "PARENT";
    }

    public ItemMenu(int id, String title, Class act) {
        this.id = id;
        this.title = title;
        this.activity = act;
        this.type = "SUB";
    }
}
