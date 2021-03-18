package app.ecommerce.ui.activity.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.RatingBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class HomeNewsDeal extends AppCompatActivity {

    private RatingBar ratingBar1;
    private RatingBar ratingBar2;
    private BottomNavigationView btmNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_news_deal);
        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Tools.setSystemBarColor(this, R.color.green_500);

        btmNav = findViewById(R.id.navigation);
        btmNav.setSelectedItemId(R.id.navigation_4);
        ratingBar1 = findViewById(R.id.rtbar1);
        ratingBar2 = findViewById(R.id.rtbar2);
        ratingBar1.setRating(4.2f);
        ratingBar2.setRating(4.5f);
    }
}