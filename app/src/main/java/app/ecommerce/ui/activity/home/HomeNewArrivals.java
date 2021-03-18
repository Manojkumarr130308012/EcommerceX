package app.ecommerce.ui.activity.home;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterTabsNewArrivals;
import app.ecommerce.ui.fragment.FragmentNewArrivals;
import app.ecommerce.ui.utils.Tools;

public class HomeNewArrivals extends AppCompatActivity {

    private ViewPager view_pager;
    private AdapterTabsNewArrivals viewPagerAdapter;
    private TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_new_arrivals);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("New arrivals");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.deep_purple_500);
    }

    private void initComponent() {
        view_pager = findViewById(R.id.view_pager);
        tab_layout = findViewById(R.id.tab_layout);
        setupViewPager(view_pager);

        tab_layout.setupWithViewPager(view_pager);
    }

    private void setupViewPager(ViewPager viewPager) {
        viewPagerAdapter = new AdapterTabsNewArrivals(getSupportFragmentManager());
        viewPagerAdapter.addFragment(FragmentNewArrivals.newInstance(), "WHAT'S NEW");
        viewPagerAdapter.addFragment(FragmentNewArrivals.newInstance(), "POPULAR");
        viewPagerAdapter.addFragment(FragmentNewArrivals.newInstance(), "HIGHLIGHTS");
        viewPager.setAdapter(viewPagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_new_arrivals, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}