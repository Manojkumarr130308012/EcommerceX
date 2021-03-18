package app.ecommerce.ui.activity.profile;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProfileRed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_red);
        initToolbar();

        (findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.orange_900);
    }

}
