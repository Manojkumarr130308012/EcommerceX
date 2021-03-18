package app.ecommerce.ui.activity.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterCategoryBestSellers;
import app.ecommerce.ui.adapter.AdapterProductGridProperty;
import app.ecommerce.ui.data.DataGenerator;
import app.ecommerce.ui.model.ExampleProduct;
import app.ecommerce.ui.model.Image;
import app.ecommerce.ui.utils.GridSpacingItemDecoration;
import app.ecommerce.ui.utils.Tools;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class CategoryBestSellers extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterCategoryBestSellers mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_best_sellers);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //change back button color
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.blue_500), PorterDuff.Mode.SRC_ATOP);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_3);

        //change system bar icon color
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, Tools.dpToPx(this, 15), true));
        recyclerView.setHasFixedSize(true);

        List<ExampleProduct> items = DataGenerator.getProducts(this);

        //set data and list adapter
        mAdapter = new AdapterCategoryBestSellers(this, items);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterCategoryBestSellers.OnItemClickListener() {
            @Override
            public void onItemClick(View view, ExampleProduct obj, int position) {
                Toast.makeText(getApplicationContext(), "Item " + position + " clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        Tools.changeMenuIconColor(menu, getResources().getColor(R.color.grey_60));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle() + " clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
