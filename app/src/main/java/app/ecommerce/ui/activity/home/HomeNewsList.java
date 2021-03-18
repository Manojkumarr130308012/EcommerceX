package app.ecommerce.ui.activity.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class HomeNewsList extends AppCompatActivity {

    private RatingBar ratingBar1;
    private RatingBar ratingBar2;
    private RatingBar ratingBar3;
    private BottomNavigationView btmNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_news_list);

        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Tools.setSystemBarColor(this, R.color.yellow_800);

        btmNav = findViewById(R.id.navigation);
        btmNav.setSelectedItemId(R.id.navigation_4);
        ratingBar1 = findViewById(R.id.rtbar1);
        ratingBar2 = findViewById(R.id.rtbar2);
        ratingBar3 = findViewById(R.id.rtbar3);
        ratingBar1.setRating(4.2f);
        ratingBar2.setRating(4.5f);
        ratingBar3.setRating(4.5f);
    }
}