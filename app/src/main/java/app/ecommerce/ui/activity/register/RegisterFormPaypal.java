package app.ecommerce.ui.activity.register;

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
import app.ecommerce.ui.fragment.FragmentFormPaypal;
import app.ecommerce.ui.utils.Tools;

public class RegisterFormPaypal extends AppCompatActivity {

    private ViewPager view_pager;
    private TabLayout tab_layout;
    private AdapterTabsNewArrivals viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form_paypal);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Register");
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
        viewPagerAdapter.addFragment(FragmentFormPaypal.newInstance(), "Paypal");
        viewPagerAdapter.addFragment(FragmentFormPaypal.newInstance(), "Credit Card");
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_form_paypal, menu);
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
