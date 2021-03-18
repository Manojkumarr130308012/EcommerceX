package app.ecommerce.ui.activity.search;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class SearchFashion extends AppCompatActivity {


    private CrystalRangeSeekbar range_seek_bar;
    private TextView price_min, price_max;

    private ImageView check1;
    private ImageView check2;
    private ImageView check3;
    private ImageView check4;
    private ImageView check5;
    private ImageView check6;
    int check = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fashion);
        initComponent();
        checkCondition();

    }

    private void initComponent() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.overlay_light_90);
        Tools.setSystemBarLight(this);

        range_seek_bar = (CrystalRangeSeekbar) findViewById(R.id.range_seek_bar);
        price_min = (TextView) findViewById(R.id.textmin);
        price_max = (TextView) findViewById(R.id.textmax);
        check1 = findViewById(R.id.color1);
        check2 = findViewById(R.id.color2);
        check3 = findViewById(R.id.color3);
        check4 = findViewById(R.id.color4);
        check5 = findViewById(R.id.color5);
        check6 = findViewById(R.id.color6);


        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 1;
                checkCondition();
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 2;
                checkCondition();
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 3;
                checkCondition();
            }
        });

        check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 4;
                checkCondition();
            }
        });

        check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 5;
                checkCondition();
            }
        });

        check6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = 6;
                checkCondition();
            }
        });


        // set listener
        range_seek_bar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                price_min.setText("$" + String.valueOf(minValue));
                price_max.setText("$" + String.valueOf(maxValue));
            }
        });
    }

    private void checkCondition() {

        if (check == 1) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_300));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_300));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_300));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.grey_300));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.red_A200));
        } else if (check == 2) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.yellow_300));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_300));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_300));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.grey_300));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.red_A200));
        } else if (check == 3) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.yellow_300));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_300));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_300));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.grey_300));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.red_A200));
        }

        if (check == 4) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.yellow_300));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_300));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_300));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.grey_300));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.red_A200));
        } else if (check == 5) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.yellow_300));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_300));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_300));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_300));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.red_A200));
        } else if (check == 6) {
            check1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.yellow_300));
            check2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.purple_300));
            check3.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_300));
            check4.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.green_300));
            check5.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.grey_300));
            check6.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.overlay_dark_60));
        }

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
