package app.ecommerce.ui.activity.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProfilePoints extends AppCompatActivity {

    private BottomNavigationView btmNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_points);

        btmNav = findViewById(R.id.navigation);
        btmNav.setSelectedItemId(R.id.navigation_menu);
        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.grey_3);
    }
}
