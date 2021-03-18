package app.ecommerce.ui.activity.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.DisplayMetrics;

import app.ecommerce.ui.R;
import app.ecommerce.ui.adapter.AdapterHomeMedical;
import app.ecommerce.ui.utils.Tools;

public class HomeMedical extends AppCompatActivity {
    public final static int LOOPS = 1000;
    public AdapterHomeMedical adapter;
    public ViewPager pager;
    public static int count = 3;
    public static int FIRST_PAGE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_medical);
        initToolbar();
        initViewPager();
    }

    private void initToolbar(){
        Tools.setSystemBarColor(this,R.color.white);
        Tools.setSystemBarLight(this);
    }

    private void initViewPager(){
        pager = (ViewPager) findViewById(R.id.myviewpager);

        //set page margin between pages for viewpager
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int pageMargin = (int)((metrics.widthPixels / 8.5) * 2);
        pager.setPageMargin(-pageMargin);

        adapter = new AdapterHomeMedical(this, getSupportFragmentManager());
        pager.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        pager.addOnPageChangeListener(adapter);
        pager.setCurrentItem(FIRST_PAGE);
        pager.setOffscreenPageLimit(3);
    }
}
