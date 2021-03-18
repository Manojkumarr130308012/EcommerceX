package app.ecommerce.ui.activity.profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProfileStoreRating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_store_rating);

        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.blue_dark);

    }
}