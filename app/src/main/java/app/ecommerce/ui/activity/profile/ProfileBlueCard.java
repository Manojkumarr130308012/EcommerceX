package app.ecommerce.ui.activity.profile;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProfileBlueCard extends AppCompatActivity {

    private LinearLayout linear1;
    private LinearLayout linear2;

    private ImageView image1;
    private ImageView image2;

    private TextView text1;
    private TextView text2;

    int check1 = 2;
    int check2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_blue_card);
        initToolbar();
        checkCondition1();
        checkCondition2();

        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCondition1();
                check1 += 1;
            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCondition1();
                check1 += 1;
            }
        });


        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCondition2();
                check2 += 1;
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCondition2();
                check1 += 2;
            }
        });
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.blue_payment);

        linear1 = findViewById(R.id.book);
        linear2 = findViewById(R.id.message);
        image1 = findViewById(R.id.image_book);
        image2 = findViewById(R.id.image_message);
        text1 = findViewById(R.id.text_book);
        text2 = findViewById(R.id.text_message);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_product_desk, menu);
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

    private void checkCondition1() {

        if (check1 % 2 == 0) {
            image1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.white));
            linear1.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
            text1.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.white));
        } else {
            image1.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
            linear1.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.white));
            text1.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
        }

    }

    private void checkCondition2() {

        if (check2 % 2 == 0) {
            image2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.white));
            linear2.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
            text2.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.white));
        } else {
            image2.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
            linear2.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.white));
            text2.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.blue_bar));
        }

    }


}