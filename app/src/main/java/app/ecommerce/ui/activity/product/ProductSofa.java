package app.ecommerce.ui.activity.product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProductSofa extends AppCompatActivity {

    private RatingBar ratingBar1;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_sofa);
        initToolbar();
        initComponent();
    }

    private void initToolbar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.grey_60), PorterDuff.Mode.SRC_ATOP);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.white);
        Tools.setSystemBarLight(this);


    }

    private void initComponent() {
        ratingBar1 = findViewById(R.id.rtbar1);
        ratingBar1.setRating(4.7f);

        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);

        text1 = findViewById(R.id.color1);
        text2 = findViewById(R.id.color2);
        text3 = findViewById(R.id.color3);
        text4 = findViewById(R.id.color4);
        text5 = findViewById(R.id.color5);
        text6 = findViewById(R.id.color6);

        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text1.setTextColor(getResources().getColor(R.color.white));

                linear2.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text2.setTextColor(getResources().getColor(R.color.grey_80));
                linear3.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text3.setTextColor(getResources().getColor(R.color.grey_80));
                linear4.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text4.setTextColor(getResources().getColor(R.color.grey_80));
                linear5.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text5.setTextColor(getResources().getColor(R.color.grey_80));
                linear6.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text6.setTextColor(getResources().getColor(R.color.grey_80));
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text1.setTextColor(getResources().getColor(R.color.grey_80));
                linear2.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text2.setTextColor(getResources().getColor(R.color.white));

                linear3.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text3.setTextColor(getResources().getColor(R.color.grey_80));
                linear4.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text4.setTextColor(getResources().getColor(R.color.grey_80));
                linear5.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text5.setTextColor(getResources().getColor(R.color.grey_80));
                linear6.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text6.setTextColor(getResources().getColor(R.color.grey_80));
            }
        });


        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text1.setTextColor(getResources().getColor(R.color.grey_80));
                linear2.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text2.setTextColor(getResources().getColor(R.color.grey_80));
                linear3.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text3.setTextColor(getResources().getColor(R.color.white));

                linear4.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text4.setTextColor(getResources().getColor(R.color.grey_80));
                linear5.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text5.setTextColor(getResources().getColor(R.color.grey_80));
                linear6.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text6.setTextColor(getResources().getColor(R.color.grey_80));
            }
        });


        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text1.setTextColor(getResources().getColor(R.color.grey_80));
                linear2.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text2.setTextColor(getResources().getColor(R.color.grey_80));
                linear3.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text3.setTextColor(getResources().getColor(R.color.grey_80));
                linear4.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text4.setTextColor(getResources().getColor(R.color.white));

                linear5.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text5.setTextColor(getResources().getColor(R.color.grey_80));
                linear6.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text6.setTextColor(getResources().getColor(R.color.grey_80));
            }
        });

        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text1.setTextColor(getResources().getColor(R.color.grey_80));
                linear2.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text2.setTextColor(getResources().getColor(R.color.grey_80));
                linear3.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text3.setTextColor(getResources().getColor(R.color.grey_80));
                linear4.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text4.setTextColor(getResources().getColor(R.color.grey_80));
                linear5.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text5.setTextColor(getResources().getColor(R.color.white));

                linear6.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text6.setTextColor(getResources().getColor(R.color.grey_80));
            }
        });


        linear6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text1.setTextColor(getResources().getColor(R.color.grey_80));
                linear2.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text2.setTextColor(getResources().getColor(R.color.grey_80));
                linear3.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text3.setTextColor(getResources().getColor(R.color.grey_80));
                linear4.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text4.setTextColor(getResources().getColor(R.color.grey_80));
                linear5.setBackgroundResource(R.drawable.rectangle_stroke_brown);
                text5.setTextColor(getResources().getColor(R.color.grey_80));
                linear6.setBackgroundResource(R.drawable.rectangle_solid_brown);
                text6.setTextColor(getResources().getColor(R.color.white));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cart, menu);
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
