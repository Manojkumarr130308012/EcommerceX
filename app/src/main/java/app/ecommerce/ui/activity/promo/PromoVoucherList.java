package app.ecommerce.ui.activity.promo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class PromoVoucherList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_voucher_list);
        initToolbar();
    }

    private void initToolbar(){
        Tools.setSystemBarColor(this, R.color.grey_3);
        Tools.setSystemBarLight(this);
    }
}
