package app.ecommerce.ui.activity.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterTabsClothes;
import app.ecommerce.ui.fragment.FragmentClothes;
import app.ecommerce.ui.utils.Tools;


public class CategoryClothes extends AppCompatActivity {

    private ViewPager view_pager;
    private AdapterTabsClothes viewPagerAdapter;
    private TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_clothes);

        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.overlay_light_90);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        view_pager = findViewById(R.id.view_pager);
        tab_layout = findViewById(R.id.tab_layout);
        setupViewPager(view_pager);
        tab_layout.setupWithViewPager(view_pager);
    }

    private void setupViewPager(ViewPager viewPager) {
        viewPagerAdapter = new AdapterTabsClothes(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentClothes(), "Cloths");
        viewPagerAdapter.addFragment(new FragmentClothes(), "Beauty");
        viewPagerAdapter.addFragment(new FragmentClothes(), "Dress");
        viewPagerAdapter.addFragment(new FragmentClothes(), "Books");
        viewPager.setAdapter(viewPagerAdapter);
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
