package app.ecommerce.ui.activity.product;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterProductListSimple;
import app.ecommerce.ui.model.ItemProductListSimple;

public class ProductListSimple extends AppCompatActivity {

    List<ItemProductListSimple> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list_simple);
        initComponent();
    }

    private void initComponent() {
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        items.add(new ItemProductListSimple(R.drawable.image_shop_1, "Fashion Grey", "Outfit Woman", "$25"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_2, "Unomy Slim", "Winter Jacket", "$35"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_3, "Yakuza Model Slim", "Minimum Jacket", "$35"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_4, "Party Blue", "Party Outfit", "$15"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_5, "Unomy Shoe", "Model Shoe", "$55"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_1, "Fashion Grey", "Outfit Woman", "$25"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_2, "Unomy Slim", "Winter Jacket", "$35"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_3, "Yakuza Model Slim", "Minimum Jacket", "$35"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_4, "Party Blue", "Party Outfit", "$15"));
        items.add(new ItemProductListSimple(R.drawable.image_shop_5, "Unomy Shoe", "Model Shoe", "$55"));

        AdapterProductListSimple adapterProductListSimple = new AdapterProductListSimple(this, items);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterProductListSimple);
    }
}
