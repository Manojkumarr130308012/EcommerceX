package app.ecommerce.ui.activity.search;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class SearchHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_house);
        initToolbar();
        (findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }
}
