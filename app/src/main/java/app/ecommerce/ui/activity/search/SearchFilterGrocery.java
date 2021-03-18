package app.ecommerce.ui.activity.search;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.RangeSeekBar;
import app.ecommerce.ui.utils.Tools;

public class SearchFilterGrocery extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filter_grocery);

        initToolbar();
        initComponenet();
    }

    private void initComponenet() {

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tv10 = (TextView) findViewById(R.id.tv10);
        tv11 = (TextView) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);
        tv13 = (TextView) findViewById(R.id.tv13);
        tv14 = (TextView) findViewById(R.id.tv14);

        final RangeSeekBar rangeSeekbar = (RangeSeekBar) findViewById(R.id.rangeSeekbar1);

        // get min and max text view
        final TextView tvMin = (TextView) findViewById(R.id.price_min);
        final TextView tvMax = (TextView) findViewById(R.id.price_max);

        // set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tvMin.setText("$" + String.valueOf(minValue));
                tvMax.setText("$" + String.valueOf(maxValue));
            }
        });

        // set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv1.setTextColor(Color.parseColor("#FFFFFF"));

                tv2.setBackgroundResource(R.color.white);
                tv2.setTextColor(Color.parseColor("#999999"));

                tv3.setBackgroundResource(R.color.white);
                tv3.setTextColor(Color.parseColor("#999999"));

                tv4.setBackgroundResource(R.color.white);
                tv4.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv2.setTextColor(Color.parseColor("#FFFFFF"));

                tv1.setBackgroundResource(R.color.white);
                tv1.setTextColor(Color.parseColor("#999999"));

                tv3.setBackgroundResource(R.color.white);
                tv3.setTextColor(Color.parseColor("#999999"));

                tv4.setBackgroundResource(R.color.white);
                tv4.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv3.setTextColor(Color.parseColor("#FFFFFF"));

                tv1.setBackgroundResource(R.color.white);
                tv1.setTextColor(Color.parseColor("#999999"));

                tv2.setBackgroundResource(R.color.white);
                tv2.setTextColor(Color.parseColor("#999999"));

                tv4.setBackgroundResource(R.color.white);
                tv4.setTextColor(Color.parseColor("#999999"));
            }
        });


        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv4.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv4.setTextColor(Color.parseColor("#FFFFFF"));

                tv1.setBackgroundResource(R.color.white);
                tv1.setTextColor(Color.parseColor("#999999"));

                tv2.setBackgroundResource(R.color.white);
                tv2.setTextColor(Color.parseColor("#999999"));

                tv3.setBackgroundResource(R.color.white);
                tv3.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv5.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv5.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv6.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv6.setTextColor(Color.parseColor("#FFFFFF"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv7.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv7.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv8.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv8.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv9.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv9.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv10.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv10.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv11.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv11.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv12.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv12.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv13.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv13.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));

                tv14.setBackgroundResource(R.color.white);
                tv14.setTextColor(Color.parseColor("#999999"));
            }
        });

        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv14.setBackgroundResource(R.drawable.tab_rounded_filter_selected);
                tv14.setTextColor(Color.parseColor("#FFFFFF"));

                tv6.setBackgroundResource(R.color.white);
                tv6.setTextColor(Color.parseColor("#999999"));

                tv5.setBackgroundResource(R.color.white);
                tv5.setTextColor(Color.parseColor("#999999"));

                tv8.setBackgroundResource(R.color.white);
                tv8.setTextColor(Color.parseColor("#999999"));

                tv9.setBackgroundResource(R.color.white);
                tv9.setTextColor(Color.parseColor("#999999"));

                tv10.setBackgroundResource(R.color.white);
                tv10.setTextColor(Color.parseColor("#999999"));

                tv11.setBackgroundResource(R.color.white);
                tv11.setTextColor(Color.parseColor("#999999"));

                tv12.setBackgroundResource(R.color.white);
                tv12.setTextColor(Color.parseColor("#999999"));

                tv13.setBackgroundResource(R.color.white);
                tv13.setTextColor(Color.parseColor("#999999"));

                tv7.setBackgroundResource(R.color.white);
                tv7.setTextColor(Color.parseColor("#999999"));
            }
        });


    }


    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);

    }


}