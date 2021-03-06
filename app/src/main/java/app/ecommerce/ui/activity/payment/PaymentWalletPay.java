package app.ecommerce.ui.activity.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import app.ecommerce.ui.R;
import app.ecommerce.ui.utils.Tools;

public class PaymentWalletPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_wallet_pay);
        initToolbar();
    }

    private void initToolbar() {
        Tools.setSystemBarColor(this,R.color.grey_tool);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }
}