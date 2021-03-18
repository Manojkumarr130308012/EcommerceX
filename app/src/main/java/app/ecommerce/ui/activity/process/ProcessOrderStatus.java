package app.ecommerce.ui.activity.process;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;
import app.ecommerce.ui.utils.ViewAnimation;

public class ProcessOrderStatus extends AppCompatActivity {
    private LinearLayout layoutProductInfo1;
    private LinearLayout layoutProductInfo2;
    private ImageButton btnToggleProduct1;
    private ImageButton btnToggleProduct2;
    private NestedScrollView nestedScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_order_status);
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_arrow);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Order No: #8827");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
    }

    private void initComponent() {
        layoutProductInfo1 = findViewById(R.id.lyt_product_info_1);
        btnToggleProduct1 = findViewById(R.id.bt_toggle_product_1);
        layoutProductInfo2 = findViewById(R.id.lyt_product_info_2);
        btnToggleProduct2 = findViewById(R.id.bt_toggle_product_2);

        btnToggleProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSection(view, layoutProductInfo1);
            }
        });

        btnToggleProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSection(view, layoutProductInfo2);
            }
        });

        nestedScrollView = findViewById(R.id.nested_scroll_view);
    }

    private void toggleSection(View view, final LinearLayout layout) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(layout, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nestedScrollView, layout);
                }
            });
        } else {
            ViewAnimation.collapse(layout);
        }
    }

    public boolean toggleArrow(View view) {
        if (view.getRotation() == 0) {
            view.animate().setDuration(200).rotation(180);
            return true;
        } else {
            view.animate().setDuration(200).rotation(0);
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
