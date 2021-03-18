package app.ecommerce.ui.activity.register;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class LoginIntro extends AppCompatActivity {

    private HorizontalScrollView horizontalScrollView1;
    private HorizontalScrollView horizontalScrollView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_intro);
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }

    private void initComponent() {
        horizontalScrollView1 = findViewById(R.id.scroll1);
        horizontalScrollView2 = findViewById(R.id.scroll2);

        //Auto scroll to center
        horizontalScrollView1.post(new Runnable() {
            @Override
            public void run() {
                int centerZ1 = 50;

                horizontalScrollView1.scrollTo(centerZ1, 0);
                horizontalScrollView1.isSmoothScrollingEnabled();
            }
        });

        horizontalScrollView2.post(new Runnable() {
            @Override
            public void run() {
                int centerZ2 = 250;

                horizontalScrollView2.scrollTo(centerZ2, 0);
                horizontalScrollView2.isSmoothScrollingEnabled();
            }
        });

    }
}
