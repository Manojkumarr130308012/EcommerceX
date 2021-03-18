package app.ecommerce.ui.activity.promo;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class PromoCouponApply extends AppCompatActivity {

    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_coupon_apply);
        initToolbar();
        initComponent();
        setColor(linear2);
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.overlay_dark_90), PorterDuff.Mode.SRC_ATOP);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);

    }

    private void initComponent() {
        linear1 = findViewById(R.id.coupon1);
        linear2 = findViewById(R.id.coupon2);
        linear3 = findViewById(R.id.coupon3);
        linear4 = findViewById(R.id.coupon4);

        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear1);

                setWhite(linear2);
                setWhite(linear3);
                setWhite(linear4);
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear2);

                setWhite(linear1);
                setWhite(linear3);
                setWhite(linear4);
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear3);

                setWhite(linear1);
                setWhite(linear2);
                setWhite(linear4);
            }
        });

        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setColor(linear4);

                setWhite(linear1);
                setWhite(linear2);
                setWhite(linear3);
            }
        });

    }


    private void setColor(LinearLayout view) {
        view.setBackgroundResource(R.drawable.rectangle_dotted_green);
        view.setPadding(18, 26, 18, 26);
    }

    private void setWhite(LinearLayout view) {
        view.setBackgroundResource(R.drawable.rectangle_dotted_outline_grey);
        view.setPadding(18, 26, 18, 26);
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