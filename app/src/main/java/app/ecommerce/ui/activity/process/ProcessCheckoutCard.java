package app.ecommerce.ui.activity.process;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProcessCheckoutCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_checkout_card);
        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);
    }
}
