package app.ecommerce.ui.activity.search;

import android.os.Bundle;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class SearchHotels extends AppCompatActivity {

    private RatingBar ratingBar1;
    private RatingBar ratingBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hotels);
        initToolbar();

        ratingBar1 = findViewById(R.id.rtbar1);
        ratingBar2 = findViewById(R.id.rtbar2);
        ratingBar1.setRating(4.2f);
        ratingBar2.setRating(4.5f);

    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        Tools.setSystemBarColor(this, R.color.blue_500);
    }

}
