package app.ecommerce.ui.activity.product;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProductVariant extends AppCompatActivity {
    private LinearLayout[] size = new LinearLayout[4];
    private LinearLayout[] color = new LinearLayout[5];
    private ImageView[] check = new ImageView[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_variant);
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Store");
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_arrow_dark);
        Tools.setSystemBarColor(this, R.color.white);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        //init for color
        for (int i = 0; i < 5; i++) {
            int colorId = getResources().getIdentifier("color_" + (i + 1), "id", getPackageName());
            int checkId = getResources().getIdentifier("check_" + (i + 1), "id", getPackageName());
            color[i] = findViewById(colorId);
            check[i] = findViewById(checkId);
        }

        //init for size
        for (int i = 0; i < 4; i++) {
            int sizeId = getResources().getIdentifier("size_" + (i + 1), "id", getPackageName());
            size[i] = findViewById(sizeId);
        }

        size[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[2], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[2], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[3], false);
            }
        });

        size[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundSizeDrawable(view, true);
                setBackgroundSizeDrawable(size[0], false);
                setBackgroundSizeDrawable(size[1], false);
                setBackgroundSizeDrawable(size[2], false);
            }
        });

        color[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[0], true);
                setCheckColor(check[1], false);
                setCheckColor(check[2], false);
                setCheckColor(check[3], false);
                setCheckColor(check[4], false);
            }
        });

        color[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[1], true);
                setCheckColor(check[0], false);
                setCheckColor(check[2], false);
                setCheckColor(check[3], false);
                setCheckColor(check[4], false);
            }
        });

        color[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[2], true);
                setCheckColor(check[0], false);
                setCheckColor(check[1], false);
                setCheckColor(check[3], false);
                setCheckColor(check[4], false);
            }
        });

        color[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[3], true);
                setCheckColor(check[0], false);
                setCheckColor(check[1], false);
                setCheckColor(check[2], false);
                setCheckColor(check[4], false);
            }
        });

        color[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCheckColor(check[4], true);
                setCheckColor(check[0], false);
                setCheckColor(check[1], false);
                setCheckColor(check[2], false);
                setCheckColor(check[3], false);
            }
        });
    }

    private void setBackgroundSizeDrawable(View view, boolean selected) {
        final int sdk = android.os.Build.VERSION.SDK_INT;

        if (selected) {
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_round_grey));
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_round_grey));
            }
        } else {
            if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                view.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline));
            } else {
                view.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn_rounded_outline));
            }
        }
    }

    private void setCheckColor(View view, boolean selected) {
        if (selected) view.setVisibility(View.VISIBLE);
        else view.setVisibility(View.INVISIBLE);
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
