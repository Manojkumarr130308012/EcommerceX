package app.ecommerce.ui.activity.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class HomeResto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_resto);
        initToolbar();
    }

    private void initToolbar(){
        Tools.setSystemBarColor(this, R.color.blue_600);
    }
}
