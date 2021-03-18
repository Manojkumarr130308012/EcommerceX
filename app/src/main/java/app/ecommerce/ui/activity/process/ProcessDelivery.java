package app.ecommerce.ui.activity.process;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class ProcessDelivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_delivery);
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);
    }
}
